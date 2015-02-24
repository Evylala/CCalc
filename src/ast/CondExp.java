package ast;

import java.util.List;

import env.Env;

public class CondExp extends Expression {
	Expression test;
	Expression trueBranch;
	Expression falseBranch;
	
	public CondExp(Expression test, Expression trueBranch,
			Expression falseBranch) {
		this.test = test;
		this.trueBranch = trueBranch;
		this.falseBranch = falseBranch;
	}

	@Override
	public String toString() {
		return "CondExp(" + test + ", " + trueBranch + ", " + falseBranch + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		this.test.eval(envVar, envArite);
		this.trueBranch.eval(envVar, envArite);
		this.falseBranch.eval(envVar, envArite);
		
	}

	@Override
	public String gen(int padding) {
		StringBuilder generation = new StringBuilder();
		generation.append("(");
		generation.append(test.gen(padding));
		generation.append(")");
		generation.append(" ? ");
		generation.append(trueBranch.gen(padding));
		generation.append(" : ");
		generation.append(falseBranch.gen(padding));
		generation.append("");
		return generation.toString();
	}
}
