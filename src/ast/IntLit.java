package ast;

import java.util.List;

import env.Env;

public class IntLit extends Expression {
	public int value;

	public IntLit(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLit(" + value + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String gen(int padding) {
		return String.valueOf(value);
	}
}
