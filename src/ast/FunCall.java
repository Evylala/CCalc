package ast;

import java.util.List;

import env.Env;
import error.ErrorEvaluation;

public class FunCall extends Expression {
	FunctionId functionId;
	List<Expression> arguments;

	public FunCall(FunctionId functionId, List<Expression> arguments) {
		this.functionId = functionId;
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		return "FunCall(" + functionId + ", " + arguments + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		String id = this.functionId.value();
		// Verif de l'existence de la fonction
		if (!envArite.containsKey(id)) {
			throw new ErrorEvaluation("Foonction non existante.");
		} else {
			int ariteARespecte = envArite.lookup(id);
			int ariteDonnee = arguments.size();
			int erreurArite = ariteDonnee - ariteARespecte;
			// Pas assez de param
			if (erreurArite < 0) {
				throw new ErrorEvaluation("Il manque " + erreurArite * -1 + " argument(s) pour la fonction " + id);
			}
			// Trop de param
			if (erreurArite > 0) {
				throw new ErrorEvaluation(erreurArite + " argument(s) en trop pour la fonction " + id);
			}
			// OK
			if (erreurArite == 0) {
				for (Expression arg : arguments) {
					arg.eval(envVar, envArite);
				}
			}
		}
		
	}

	@Override
	public String gen(int padding) {
		StringBuilder generation = new StringBuilder();
		generation.append(this.functionId.value() + "(");
		
		if (!arguments.isEmpty()) {
			generation.append(arguments.get(0).gen(padding));
			for (int nbArg = 1; nbArg < arguments.size(); nbArg++) {
				generation.append("," + arguments.get(nbArg).gen(padding));
			}
		}
		generation.append(")");
		return generation.toString();
	}
}
