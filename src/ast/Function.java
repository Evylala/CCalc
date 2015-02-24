package ast;

import java.util.ArrayList;
import java.util.List;

import env.Env;
import error.ErrorEvaluation;

public class Function extends AST {
	public Head head;
	public Body body;
	
	public Function(Head head, Body body) {
		this.head = head;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Function(" + head + ", " + body + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		String id = this.head.idValue();
		if (envArite.containsKey(id)) {
			throw new ErrorEvaluation("La fonction " + id + " a déjà été définie");
		} else {
			envArite.bind(id, this.head.params().size());
			for (String param : this.head.params()) {
				envVar.add(param);
			}
			body.eval(envVar, envArite);
		}
		
	}

	@Override
	public String gen(int padding) {
		List<String> params = new ArrayList<String>();
		params = this.head.params();
		StringBuilder generation = new StringBuilder();
		generation.append("int ");
		generation.append(this.head.functionId);
		generation.append("(");
		if (!params.isEmpty()) {
			generation.append(params.get(0));
			for (int nbArg = 1; nbArg < params.size(); nbArg++) {
				generation.append("," + params.get(nbArg));
			}
		}
		generation.append(")");
		generation.append(System.lineSeparator());
		generation.append("{" + System.lineSeparator());
		padding++;
		generation.append(body.gen(padding));
		generation.append(";");
		padding--;
		generation.append(System.lineSeparator());
		generation.append("}");
		generation.append(System.lineSeparator());
		return generation.toString();
	}

}
