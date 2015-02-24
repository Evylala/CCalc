package ast;

import java.util.List;

import env.Env;
import error.ErrorEvaluation;


public class Variable extends Expression {
	
	private String value;
	private VariableId varId;
	
	public Variable(VariableId varId, String value) {
		this.value = value;
		this.varId = varId;
	}
	
	public String toString() {
		return "Variable(" + this.value + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		if (!envVar.contains(varId.value())) {
			throw new ErrorEvaluation("La variable " + this.value + " n'est pas définie.");
		}
		
	}

	@Override
	public String gen(int padding) {
		return this.varId.value();
	}

}

