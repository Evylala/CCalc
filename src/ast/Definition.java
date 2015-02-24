package ast;

import java.util.List;

import env.Env;
import error.ErrorEvaluation;

public class Definition extends AST {
	public VariableId variableId;
	public Expression expression;
	
	public Definition(VariableId variableId, Expression expression) {
		this.variableId = variableId;
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "Definition(" + variableId + ", " + expression + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		String id = this.variableId.value();
		boolean variableDejaExistante = envVar.contains(id);
		if (variableDejaExistante) {
			throw new ErrorEvaluation("Variable déjà définie : " + id);
		} else {
			envVar.add(id);
			expression.eval(envVar, envArite);
		}
		
	}

	@Override
	public String gen(int padding) {
		return "int " + this.variableId.value() + " = " + expression.gen(padding) + ";";
	}
}
