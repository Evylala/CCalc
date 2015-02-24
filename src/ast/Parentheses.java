package ast;

import java.util.List;

import env.Env;

public class Parentheses extends Expression {
	public Expression exp;

	public Parentheses(Expression exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Parentheses(" + this.exp + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		this.exp.eval(envVar, envArite);
		
	}

	@Override
	public String gen(int padding) {
		return "(" + exp.gen(padding) + ")";
	}

}
