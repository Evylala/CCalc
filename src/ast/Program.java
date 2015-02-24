package ast;

import java.util.ArrayList;
import java.util.List;

import env.Env;

public class Program extends AST {
	public List<Function> functions;
	public Body body;

	public Program(List<Function> functions, Body body) {
		this.functions = functions;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Program(" + functions + ", " + body + ")";
	}

	@Override
	public void eval(List<String> envVar, Env<Integer> envArite) {
		envVar = new ArrayList<String>();
		envArite = new Env<Integer>();
		for (Function function : functions) {
			function.eval(envVar, envArite);
		}
		envVar.clear();
		body.eval(envVar, envArite);
		
	}

	@Override
	public String gen(int padding) {
		StringBuilder generation = new StringBuilder();
		
		//import
		generation.append("#include <stdio.h>" + System.lineSeparator());
		for (Function function : functions) {
			generation.append(function.gen(padding));
		}
		generation.append(body.genMain(padding));
		return generation.toString();
	}
}
