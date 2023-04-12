package visiteur;

import java.util.*;

import ast.*;
import org.antlr.runtime.tree.TreeWizard;
import visiteur.SymbolTable;
import visiteur.Visitor;

public class TypeChecker extends Visitor<Type> {

	private SymbolTable table;
	private String currentMethod;
	private Stack<Block> visitedBlocks;

	public Stack<Block> getVisitedBlocks(){
		return visitedBlocks;
	}


	//Dans un second temps :
	//- Vérifiez que dans le corps de chaque méthode, une valeur
	//	du bon type est retournée (dans chaque branche des
	//	conditionnelles, en particulier).
	//
	//- Vérifiez pour chaque nœud qu’il est atteignable,
	//    c’est-à-dire qu’il ne vient pas après un 'return'. Sinon,
	//    levez une erreur.
	
	private final static Type statType = new TypePrim(TypePrim.Prim.STAT);//pour les instructions
	private final static Type errType = new TypePrim(TypePrim.Prim.IND);//pour les erreurs
    private final static Type intType = new TypePrim(TypePrim.Prim.INT);//pour les int
    private final static Type boolType = new TypePrim(TypePrim.Prim.BOOL);//pour les bool

	private final static Type tabType = new TypePrim(TypePrim.Prim.TAB);//pour les tab

	public TypeChecker(SymbolTable t){
		//le TypeChecker dépend de la table des symboles qui a
		//été créée à l’étape précédente, et est initialisé
		//avec le constructeur de la super classe, avec
		//statType comme élément par défaut, car c’est le type
		//renvoyé par un programme.
		
		//super(statType);
		this.visitedBlocks=new Stack<Block>();
		this.table=t;
	}

	public void check(){
		//S’il y a des erreurs, sortir du programme principal. Sinon, ne
		//rien faire.	
	}


	public Type visit(ExpId e) throws Exception {
		//retourner le type de l’identifiant correspondant, et
		//une erreur si non trouvé : la variable n’a pas été
		//déclarée auparavant (ou il y a un autre problème)
		Type type = this.table.variableLookup(e.getValue(),visitedBlocks);
		if(e.getValue().equals("true") || e.getValue().equals("false")){
			return boolType;
		}
		else if(type!=null){
			return type;
		}
		else {
			throw new Exception("Erreur de typage : " + e.getValue() + " " + type);
		}
	}

	public Type visit(ExpInt e){
		//retourner le type int dans tous les cas
		return intType;
	}
	public Type visit(Const c){
		//
		return boolType;
	}

	public Type visit (CalcuAff ca) throws Exception {

		//affectation : récupérer le type de l’identifiant, le
		//type de l’expression, et s’assurer que les deux sont
		//identiques. Sinon, lever une erreur précise
		//(impossible d’affecter l’exp de type… à la var. de
		//type … ).
		//
		//retourner un type Instruction s’il n’y a pas
		//d’erreur
		Type CalcuAffExp = ca.getExp().accept(this);

		Type CalcuAffID = table.variableLookup(ca.getID(), this.visitedBlocks);

		if (CalcuAffID.getType().toLowerCase().equals(CalcuAffExp.getType().toLowerCase())) {
			return statType;
		} else {
			throw new Exception("La valeur à affectee n'est pas du meme type que la variable à qui on l'affecte");
		}
	}

	public Type visit(InstrDecl decl) throws Exception {
		Type declExpType = decl.getExp().accept(this);
		Type declType = decl.getType();

		if(declExpType!=null){
			if(declType.getType().toLowerCase().equals(declExpType.getType().toLowerCase())){
				table.addLocalVariable(visitedBlocks.peek(),decl.getID(),declType);
				return statType;
			}
			else {
				throw new Exception("La valeur de la declaration n'est pas du meme type que la variable");
			}
		}
		else {
			throw new Exception("L'expression est null");
		}
	}


	public Type visit(Function fun) throws Exception {
		//visiter le bloc du corps de la méthode. (les paramètres
		//auront été intégrés à la table locale dans le
		//tableBuilder, donc on n’aura pas en s’en occuper
		//précisément ici).
		currentMethod = fun.getType().getType();
		return visit(fun.getBlock());
	}

	public Type visit(ExpBin e) throws Exception {
		// récupérer les deux types retournés par les sous
		// expressions visitées, vérifier qu’ils sont
		// identiques.
		//
		// Puis selon l’opérateur, vérifier que ce sont bien
		// ceux attendus.
		Type expGauche = e.getExpgauche().accept(this);
		Type expDroite = e.getExpdroite().accept(this);

		if (expGauche.getType().toLowerCase().equals(expDroite.getType().toLowerCase())) {
			if (expGauche.getType().toLowerCase().equals(intType.getType().toLowerCase())) {
				if (e.getOp() == Op.MOINS || e.getOp() == Op.PLUS  || e.getOp() == Op.PRODUIT || e.getOp() == Op.DIV) {
					return expGauche;
				}

				if(((e.getOp() == Op.EGALEGAL|| e.getOp() == Op.INF || e.getOp() == Op.SUP) && expGauche.getType().toLowerCase().equals(intType.getType().toLowerCase()) && expDroite.getType().toLowerCase().equals(intType.getType().toLowerCase()))){
					return boolType;
				}
				else {
					return errType;
				}
			}
			else if (expDroite.getType().toLowerCase().equals(boolType.getType().toLowerCase())) {
				if (e.getOp() == Op.OU || e.getOp() == Op.ET || e.getOp() == Op.EGALEGAL) {
					return expDroite;
				}
				if((e.getOp() == Op.EGALEGAL && expGauche.getType().toLowerCase().equals(boolType.getType().toLowerCase()) && expDroite.getType().toLowerCase().equals(boolType.getType().toLowerCase()))){
					return boolType;
				}
				else {
					return errType;
				}
			}
			else {
				return errType;
			}
		}
		else {
			return errType;
		}
	}

	public Type visit(ExpUn expUn) throws Exception {
		Type typeexp = expUn.getExp().accept(this);

		if (typeexp.getType().toLowerCase().equals(intType.getType().toLowerCase())){
			if ((expUn.getOp() == Op.MOINS || expUn.getOp() == Op.VALEURABSOLUE || expUn.getOp() == Op.PLUS) && typeexp.getType().toLowerCase().equals(intType.getType().toLowerCase())){
				System.out.println("unaire");
				return typeexp;
			}
			else {
				throw new Exception("L'expression unaire n'est pas correct");
			}
		}
		else if(typeexp.getType().toLowerCase().equals(boolType.getType().toLowerCase())){
			if(expUn.getOp() == Op.NEG){
				return 	typeexp;
			}
			else {
				throw new Exception("L'expression unaire n'est pas correct");
			}
		}
		else {
			throw new Exception("L'expression unaire n'est pas correct");
		}
	}

	public Type visit(ExpCall expCall) throws Exception {
		MethodSig methodSig = this.table.methodLookup(expCall.getId());
		if(methodSig !=null){
			if(methodSig.getParams().size() == expCall.getLstExpr().size()){
				for (int i = 0; i <methodSig.getParams().size();i++){
					if(!methodSig.getParams().get(i).getType().equals(expCall.getLstExpr().get(i).accept(this))){
						return errType;
					}
				}
			}else {
				return errType;
			}
		}
		else {
			return errType;
		}

		// plus compliqué : vérifier que le nombre de
		// paramètres est bien celui attendu, et qu’ils sont
		// tous du bon type. Commencer par récupérer la
		// signature de la méthode dans la table des symboles.
		// Si elle n’y est pas , c’est que la méthode n’a pas
		// été déclarée, ou qu’il y a un autre problème.
		return null;
	}

	public Type visit(InstrReturn instrReturn) throws Exception {
		Type instrReturnexp = instrReturn.getExp().accept(this);


		if (!(instrReturnexp.getType().toLowerCase().equals(this.currentMethod.toLowerCase()))){
			throw new Exception("Le type de retour de la fonction ne correspond pas au type attendu");
		}
		else {
			//visiter l’expression retournée
			//Si vous vérifiez qu’une méthode renvoie toujours
			//quelque chose, faites une mise à jour ici.
			return statType;
		}
	}

	public Type visit(InstrIf instrIf) throws Exception {
		Type instrIfexp = instrIf.getExp().accept(this);
		if (instrIfexp.getType().toLowerCase().equals(boolType.getType().toLowerCase())) {
			instrIf.getBlock().getInstr().accept(this);
			instrIf.getBlock2().getInstr().accept(this);
		}else {
			throw new Exception("L'expression du if n'est pas correcte");
			//return errType;
		}
		//pour le typage : visiter tous les blocs, et vérifier
		//que la condition est de type bool.
		//
		//pour vérifier qu’une méthode renvoie toujours
		//quelque chose : si les deux blocs retournent une
		//valeur, faire une mise à jour.
		return statType;
	}

	public Type visit(InstrWhile instrWhile) throws Exception {
		Type instrWhileexp = instrWhile.getExp().accept(this);
		if (instrWhileexp.getType().toLowerCase().equals(boolType.getType().toLowerCase())) {
			instrWhile.getBlock().getInstr().accept(this);
		}else {
			throw new Exception("L'expression du while n'est pas correcte");
			//return errType;
		}
		//pour le typage : visiter tous les blocs, et vérifier
		//que la condition est de type bool.
		//
		//pour vérifier qu’une méthode renvoie toujours
		//quelque chose : si les deux blocs retournent une
		//valeur, faire une mise à jour.
		return statType;
	}



	public Type visit(Block b) throws Exception {
		//utiliser la méthode de visite de la super classe,
		//mais ne pas oublier de noter dans la pile l’entrée
		//et la sortie du bloc !
		this.visitedBlocks.push(b);
		super.visit(b);
		this.visitedBlocks.pop();
		return null;

	}

	@Override
	public Type visit(CalcuIncr calcuIncr) throws Exception {

		Type calcuIncrID = table.variableLookup(calcuIncr.getID(), this.visitedBlocks);
		if(calcuIncrID==null){
			throw new Exception("La variable que vous voulez incrementer n'existe pas");
		}
		else if(calcuIncrID.getType().toLowerCase().equals(intType.getType().toLowerCase())){
			return intType;
		}
		else {
			throw new Exception("Vous essayez d'incrementer une variable qui n'est pas un int");
		}
	}

	@Override
	public Type visit(CalcuDecr calcuDecr) throws Exception {
		Type calcuDecrID = table.variableLookup(calcuDecr.getID(), this.visitedBlocks);
		if(calcuDecrID==null){
			throw new Exception("La variable que vous voulez decrementer n'existe pas");
		}
		else if(calcuDecrID.getType().toLowerCase().equals(intType.getType().toLowerCase())){
			return intType;
		}
		else {
			throw new Exception("Vous essayez de decrementer une variable qui n'est pas un int");
		}
	}

	@Override
	public Type visit(InstrFor instrFor) throws Exception {
		Type instrForIDType = table.variableLookup(instrFor.getID(), this.visitedBlocks);
		Type instrForExpType = instrFor.getLstExpr().get(0).accept(this);
		if(!instrForExpType.getType().toLowerCase().equals(instrForIDType.getType().toLowerCase())){
			throw new Exception("Vous essayez de déclarer une variable avec une valeur d'un type différent");
		}
		Type typeBoucle = instrFor.getLstExpr().get(1).accept(this);
		if(!typeBoucle.getType().toLowerCase().equals(boolType.getType().toLowerCase())){
			throw new Exception("L'expression dans votre boucle for n'est pas correcte");
		}
		instrFor.getBlock().getInstr().accept(this);
		instrFor.getCalcu().accept(this);

		return statType;
	}

	/*
	public Type visit (InstrCalcu ic) throws Exception {

		//affectation : récupérer le type de l’identifiant, le
		//type de l’expression, et s’assurer que les deux sont
		//identiques. Sinon, lever une erreur précise
		//(impossible d’affecter l’exp de type… à la var. de
		//type … ).
		//
		//retourner un type Instruction s’il n’y a pas
		//d’erreur
		Type instrCalcuCalc = ic.getCalcu().accept(this);

		Type instrAffID = table.variableLookup(ia.getID(), this.visitedBlocks);

		if (instrAffID.getType().toLowerCase().equals(instrAffExp.getType().toLowerCase())) {
			return statType;
		} else {
			throw new Exception("La valeur à affectee n'est pas du meme type que la variable à qui on l'affecte");
		}
	}

	 */
}
	

