package ast;

import java.util.List;

import env.Env;

public class BinaryExp extends Expression {
	public BinaryOp op;
	public Expression expression1;
	public Expression expression2;
		
	public BinaryExp(BinaryOp op, Expression expression1, Expression expression2) {
		super();
		this.op = op;
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public String toString() {
		return "BinaryExp(" + op + ", " + expression1 + ", " + expression2 + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		this.expression1.eval(envVar, envArite);
		this.expression2.eval(envVar, envArite);
	}

	@Override
	public String gen(int padding) {
		String ope = null;
		switch (op) {
		case PLUS:
			ope = "+";
			break;
		case MINUS:
			ope = "-";
			break;
		case TIMES:
			ope = "*";
			break;
		case DIVIDE:
			ope = "/";
			break;
		case EQUAL:
			ope = "==";
			break;
		case NOTEQUAL:
			ope = "==";
			break;
		case LESS:
			ope = "==";
			break;
		case LESSOREQUAL:
			ope = "<=";
			break;
		case GREATER:
			ope = ">";
			break;
		case GREATEROREQUAL:
			ope = ">=";
			break;
		case OR:
			ope = "||";
			break;

		default:
			System.out.println("Non-existant operator.");
			break;
		}
		return expression1.gen(padding) + " " + ope + " " + expression2.gen(padding);
	}
}
