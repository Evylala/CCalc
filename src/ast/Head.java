package ast;

import java.util.ArrayList;
import java.util.List;

import env.Env;

public class Head extends AST {
	FunctionId functionId;
	List<VariableId> parameters;

	public Head(FunctionId functionId, List<VariableId> parameters) {
		this.functionId = functionId;
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "Head(" + functionId + ", " + parameters + ")";
	}
	
	public String idValue() {
		return this.functionId.value();
	}
	
	public List<String> params() {
		List<String> params = new ArrayList<String>();
		for (VariableId var : parameters) {
			params.add(var.value());
		}
		return params;
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String gen(int padding) {
		// TODO Auto-generated method stub
		return null;
	}
}
