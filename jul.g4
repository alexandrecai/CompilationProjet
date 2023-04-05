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

pv: ';';
inst:
    'return' exp pv				#instReturn
    |type ID ('=' exp)? pv			#instDecl
    |ID '=' exp pv				#instAff
    |'print' '(' exp ')' pv			#instPrint
    |'if' '('exp')' inst 'else' inst		#instIf
    |'while' '(' exp ')' inst			#instWhile
   |'{' inst* '}'				#instList
;
program: (inst|function)+;

