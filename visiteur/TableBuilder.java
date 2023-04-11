package visiteur;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ast.*;

public class TableBuilder extends Visitor<Void> {
	//NÉCESSITE QUE VOUS AYEZ
	//CODÉ LE VISITEUR GÉNÉRIQUE DE VOTRE AST
	
	private final SymbolTable symbolTable;
	private final Stack<Block> visitedBlocks;//historique des blocs visités : représente l’imbrication courante

	public TableBuilder(){
		//super();
		this.visitedBlocks=new Stack<Block>();
		this.symbolTable=new SymbolTable();
	}

	public SymbolTable getTable(){
		//si la table contient des erreurs, les afficher ici
		//et quitter le programme.
		return this.symbolTable;
	}

	@Override
	public Void visit(Block b) throws Exception {
		//le visiteur entre dans le bloc
		this.symbolTable.localTable(b);
		this.visitedBlocks.push(b);
		super.visit(b);
		this.visitedBlocks.pop();
		//le visiteur sort du bloc
		return null;
	}


	@Override
	public Void visit(InstrDecl id) throws Exception {
		//regarder (à l’aide de la méthode lookup de la table
		//des symboles) si la variable a déjà été déclarée
		//dans un bloc parent. Si c’est le cas, lever une
		//erreur.

		Type type = this.symbolTable.variableLookup(id.getID(),this.visitedBlocks);
		if(type!=null){
			throw new Exception("Variable deja declaree : " + id.getID());
		}

		if(visitedBlocks.isEmpty()){
			throw new Exception("visitedBlocks est vide");
		}


		this.symbolTable.addLocalVariable(this.visitedBlocks.peek(),id.getID(),id.getType());

		//Sinon, enregistrer la déclaration dans la table
		//locale correspondant au bloc courant (celui au
		//sommet de la pile, récupérable grâce à peek() de la
		//classe Stack.

		return null;
	}

	@Override
	public Void visit(Function fun) throws Exception {
		//récupérer le bloc correspondant au corps de la
		//méthode, ainsi que la signature de la méthode.
		//
		//
		MethodSig ms = MethodSig.signatureOf(fun);
		Block block = fun.getBlock();



		symbolTable.localTable(block);

		this.visitedBlocks.push(block);

		List<String> Params = new ArrayList<>();

		for (Param param : fun.getParams()){
			if (Params.contains(param.getId())){
				throw new Exception("La variable suivante est deja declaree : " + param.getId());
			}
			else {
				Params.add(param.getId());
				symbolTable.addLocalVariable(this.visitedBlocks.peek(), param.getId(), param.getType());
			}
		}

		MethodSig testSignature = this.symbolTable.methodLookup(fun.getId());

		if (testSignature != null){
			throw new Exception("La fonction suivante est deja declaree : " + fun.getId());
		}
		if (visitedBlocks.isEmpty()){
			throw new Exception("visitedBlocks est vide");
		}
		else {
			this.symbolTable.addMethod(fun.getId(), ms);
		}

		super.visit(block);

		visitedBlocks.pop();


		
		return null;
	}

	@Override
	public Void visit(InstrIf i) throws Exception{
		return super.visit(i);
	}

	@Override
	public Void visit(InstrWhile i) throws Exception{
		return super.visit(i);
	}

	@Override
	public Void visit(Program program) throws Exception{

		return super.visit(program);
	}

	@Override
	public Void visit(InstrFor instrFor) throws Exception {

		Type typeDecl = this.symbolTable.variableLookup(instrFor.getID(),this.visitedBlocks);
		if(typeDecl!=null){
			throw new Exception("Variable deja declaree : " + instrFor.getID());
		}
		if(visitedBlocks.isEmpty()){
			throw new Exception("visitedBlocks est vide");
		}


		this.symbolTable.addLocalVariable(this.visitedBlocks.peek(),instrFor.getID(),instrFor.getType());

		return null;
	}
}
