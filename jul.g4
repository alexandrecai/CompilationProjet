grammar jul;  //Juste Un Langage


WS:[ \t\n\r] -> skip;
INT:[0-9]+;

Op:'*'|'+'|'-'|'&&'|'||'|'=='|'<' | 'not'|'abs'|'/';

Const:'true'|'false';
type: 'bool' | 'int' ;

ID:[a-zA-Z][a-zA-Z0-9]*;

exp:
    INT                                    		#expInt
    |ID                                      		#expId
   |Const						#expConst
    |exp Op exp     					#expBin
    |Op exp             				#expUn
    |'(' exp ')'                           		#expPar
    |'read()'                               		#expRead
    |ID '(' (exp (',' exp)*)? ')'			#expCall

;

function : type ID '(' (param (',' param)*)? ')' inst ;
param : type ID;

calcu:
    ID'++'          #calcuIncr
    |ID'--'          #calcuDecr
    |ID '=' exp				#calcuAff
;

pv: ';';
inst:
    'return' exp pv				#instReturn
    |calcu pv                    #instCalcu
    |type ID ('=' exp)? pv			#instDecl
    |'print' '(' exp ')' pv			#instPrint
    |'if' '('exp')' inst 'else' inst		#instIf
    |'while' '(' exp ')' inst			#instWhile
    |'for' '('type ID '=' exp ';' exp ';' calcu ')' inst #instFor
   |'{' inst* '}'				#instList

;



program: (inst|function)+;

