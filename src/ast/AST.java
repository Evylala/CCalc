package ast;

import java.util.List;

import env.Env;

public abstract class AST {
	public abstract String toString();
	public abstract void eval(List<String> envVar, Env<Integer> envArite);
	public abstract String gen(int padding);
}
