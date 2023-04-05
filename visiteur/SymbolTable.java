package visiteur;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import support.Errors;
import ast.*;
import ast.Block;
import visiteur.MethodSig;

public class SymbolTable {
	//pour les fonctions : 
	private Map<String, MethodSig> methods;
	//pour les blocs : chaque bloc
	// est associé à sa table locale.
	private Map<Block,Map<String,Type>> blocks;

	public SymbolTable(){
		methods=new HashMap<>();
		blocks=new HashMap<>();
	}

	public void addMethod(String nom,MethodSig ms){
		this.methods.put(nom,ms);
	}

	public void addLocalVariable(Block block, String nom, Type type){
		localTable(block);
		Map<String,Type> var = blocks.get(block);
		var.put(nom,type);
		this.blocks.put(block,var);
	}

	public void localTable(Block b){
		//Ajoute la table locale du block b
		if(blocks.get(b)==null){
			Map<String,Type> localT =new HashMap<>();
			blocks.put(b,localT);
		}
	}
	public MethodSig methodLookup(String name){
		return methods.get(name);
	}

	public Type variableLookup(String name,Stack<Block> visitedBlocks) throws Exception {
		//retourne le type d’une variable, dans un historique
		//de blocs donné. Lève une erreur si le bloc, n’est
		//pas associé à une table locale, mais peut retourner
		//null (sans forcément lever une erreur si l’on n’a
		//pas trouvé de type).
		for (Block b:visitedBlocks){
			Map<String, Type> localTable = blocks.get(b);
			if(localTable == null){
				throw new Exception("localTable==null");
			}
			Type t = localTable.get(name);
			if(t != null){
				return t;
			}
		}
		return null;
	}


}
