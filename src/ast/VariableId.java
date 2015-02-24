package ast;

import java.util.List;

import env.Env;

public class VariableId extends Expression {
	String value;
	
	public VariableId(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "VariableId(" + value + ")";
	}
	
	public String value() {
		return this.value;
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
