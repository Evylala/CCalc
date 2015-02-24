package ast;

import java.util.List;

import env.Env;

public class UnaryExp extends Expression {
	public UnaryOp op;
	public Expression expression;

	@Override
	public String toString() {
		return "UnaryExp(" + op + ", " + expression + ")";
	}

	public UnaryExp(UnaryOp op, Expression expression) {
		super();
		this.op = op;
		this.expression = expression;
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		this.expression.eval(envVar, envArite);
	}

	@Override
	public String gen(int padding) {
		String ope = null;
		switch (op) {
		case NOT:
			ope = "!";
			break;
		case MINUS:
			ope = "-";
			break;
		default:
			System.out.println("Operator does not exists.");
			break;
		}
		return ope + expression.gen(padding);
	}
}
