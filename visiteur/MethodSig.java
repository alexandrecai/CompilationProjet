package visiteur;

import java.util.ArrayList;
import java.util.List;

import ast.Function;
import ast.Param;
import ast.Type;

public class MethodSig{
	private List<Param> params;
	private Type returnType;

	public MethodSig(List<Param> paramsList, Type returnType){
		this.params = paramsList;
		this.returnType = returnType;
	}

	public List<Param> getParams(){
		return this.params;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public static MethodSig signatureOf(Function fun){
		return new MethodSig(fun.getParams(),fun.getType());
	}
}

