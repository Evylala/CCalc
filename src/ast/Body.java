package ast;

import java.util.List;

import env.Env;

public class Body extends AST {
	public List<Definition> definitions;
	public Expression expression;
	
	public Body(List<Definition> definitions, Expression expression) {
		this.definitions = definitions;
		this.expression = expression;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Body(" + definitions + ", " + expression + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		for (Definition def : definitions) {
			def.eval(envVar, envArite);
		}
		expression.eval(envVar, envArite);
		
	}

	@Override
	public String gen(int padding) {
		StringBuilder generation = new StringBuilder();
		for (Definition def : definitions) {
			generation.append(def.gen(padding) + System.lineSeparator());
		}
		generation.append("return ");
		generation.append(expression.gen(padding));
		return generation.toString();
	}
	
	
	public String genMain(int padding) {
		StringBuilder generation = new StringBuilder();
		generation.append("int main(){" + System.lineSeparator());
		padding++;
		
		for (Definition def : definitions) {
			generation.append(def.gen(padding) + System.lineSeparator());
		}
		
		generation.append("return printf(\"%i\\n\", " + this.expression.gen(padding) + ");");
		padding--;
		generation.append(System.lineSeparator() + "}");
		return generation.toString();
	}
}
