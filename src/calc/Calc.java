package calc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import env.Env;
import error.ErrorFlag;
import error.ErrorListener;
import error.ErrorParse;
import parser.ASTVisitor;
import parser.CalcLexer;
import parser.CalcParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Calc {
	static final String SHELL = "/bin/bash";
	
	public static void main(String[] args) throws Exception {
		// TODO: don't proceed to next step in case of an error
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ReportingCalcLexer lexer = new ReportingCalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		
		try {
			// Erreurs d'ANTLR
			ErrorListener errorListener = new ErrorListener();
			parser.removeErrorListeners();
			parser.addErrorListener(errorListener);
			ParseTree tree = parser.program();
			if (ErrorFlag.error()) {
				throw new ErrorParse("Erreur de l'analyse lexicale sous ANTLR, voir ci-dessus.");
			}
			System.out.println(tree.toStringTree(parser));
			// building the AST with a visitor
			ASTVisitor visitor = new ASTVisitor();
			ast.AST ast = visitor.visit(tree);
			System.out.println(ast);

			// Semantic analysis
			List<String> envVar = new ArrayList<String>();
			Env<Integer> envFuncArite = new Env<Integer>();
			ast.eval(envVar, envFuncArite);

			// generate and write code
			String outputFile = write(ast.gen(0), inputFile);

			// compile code and execute (if a file has been generated)
			if (compile(outputFile)) {
				execute(inputFile);
			} else{
				System.err.println("C code does not compile");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// write code to .c file associated to .calc file passed as argument,
	// returning .c file relative filename
	static String write(String code, String filename) throws IOException{
		String CFilename = filename.replaceFirst("\\.calc\\z", ".c");
        System.out.println("writing C code to " + CFilename);
        FileWriter out = new FileWriter(CFilename);
		out.write(code);
		out.flush();
		out.close();
		return CFilename;
	}
	// compiles .c file given as argument,
	// returning true if the file has been successfully compiled
	static boolean compile(String cFilename) throws IOException, InterruptedException {
//		String[] cmd = new String[3];
//		cmd[0] = "/bin/sh";
//		cmd[1] = "-c";
//		cmd[2] = "/usr/bin/gcc " + CFilename;
		String[] cmd = {SHELL, "-c", "/usr/bin/gcc " + cFilename};
		Runtime.getRuntime().exec(cmd).waitFor();
		return new File(cFilename).exists();
	}
	// execute .c file given as argument, 
	// writing the result in .txt file	
	static void execute(String inputFile) throws IOException {
		String txtFilename = inputFile.replaceFirst("\\.calc\\z", ".txt");
		String[] cmd = {SHELL, "-c", "./a.out >" + txtFilename};
		Runtime.getRuntime().exec(cmd);
	}
}