package parser;

import java.util.ArrayList;
import java.util.List;

import parser.CalcParser.ExpressionContext;
import parser.CalcParser.FunctionIdContext;
import parser.CalcParser.VariableIdContext;
import ast.*;

public class ASTVisitor extends CalcBaseVisitor<AST> {
	
	public AST visitProgram(CalcParser.ProgramContext ctx) {
		
		// retrieve ASTs for functions
		List<CalcParser.FunctionContext> functionCtxs = ctx.function();
		List<Function> functions = new ArrayList<Function>();
		for (CalcParser.FunctionContext functionCtx : functionCtxs)
			functions.add((Function) visit(functionCtx));
		// retrieve AST for body
		Body body = (Body) visit(ctx.body());
		// return AST for program
		return new Program(functions, body);
	}
	
	public AST visitFunction(CalcParser.FunctionContext ctx) {
		// retrieve AST for functionId
		String id = ctx.head().functionId().getText();
		// retrieve ASTs for params
		List<VariableIdContext> paramsCtxs = ctx.head().variableId();
		List<VariableId> params = new ArrayList<VariableId>();
		for (VariableIdContext variable : paramsCtxs) {			
			params.add(new VariableId(variable.getText()));
		}
		// retrieve AST for body
		Body body = (Body) visit(ctx.body());
		return new Function(new Head(new FunctionId(id), params), body);
	}
	
	public AST visitBody(CalcParser.BodyContext ctx) {
		// retrieve ASTs definitions
		List<CalcParser.DefinitionContext> definitionCtxs = ctx.definition();
		List<Definition> defs = new ArrayList<Definition>();
		for (CalcParser.DefinitionContext definitionCtx : definitionCtxs) {
			defs.add((Definition) visit(definitionCtx));
		}
		// retrieve AST for expression
		Expression expr = (Expression) visit(ctx.expression());
		return new Body(defs, expr);
	}
	
	public AST visitFunCall(CalcParser.FunCallContext ctx) {
		// retrieve AST functionId
		FunctionIdContext functionIdContext = ctx.functionId();
		String id = functionIdContext.getText();
		
		// retrieve AST expressions (arguments)
		List<ExpressionContext> expressionCtxs = ctx.expression();
		List<Expression> args = new ArrayList<Expression>();
		for (ExpressionContext expression : expressionCtxs) {
			args.add((Expression) visit(expression));
		}
		return new FunCall(new FunctionId(id), args);
	}
	
	public AST visitUnaryExp(CalcParser.UnaryExpContext ctx) {
		String op = ctx.getChild(0).getText();
		UnaryOp unOp = null;
		switch (op) {
		case "-":
			unOp = UnaryOp.MINUS;
			break;
		case "!":
			unOp = UnaryOp.NOT;
			break;
		default:
			//("This operator is not defined, please use one of those  (-,!)");
		}
		Expression expression = (Expression) visit(ctx.expression());
		return new UnaryExp(unOp, expression);
	}
	
	public AST visitBinaryExp(CalcParser.BinaryExpContext ctx) {
		// retrieve ASTs for expressions
		Expression expr1 = (Expression) visit(ctx.expression().get(0));
		Expression expr2 = (Expression) visit(ctx.expression().get(1));

		// retrieve AST for operator
		String op = ctx.getChild(1).getText();
		BinaryOp binOp = null;
		switch (op) {
		case "*":
			binOp = BinaryOp.TIMES;
			break;
		case "/":
			binOp = BinaryOp.DIVIDE;
			break;
		case "+":
			binOp = BinaryOp.PLUS;
			break;
		case "-":
			binOp = BinaryOp.MINUS;
			break;
		case "<":
			binOp = BinaryOp.LESS;
			break;
		case ">":
			binOp = BinaryOp.GREATER;
			break;
		case "<=":
			binOp = BinaryOp.LESSOREQUAL;
			break;
		case ">=":
			binOp = BinaryOp.GREATEROREQUAL;
			break;
		case "==":
			binOp = BinaryOp.EQUAL;
			break;
		case "!=":
			binOp = BinaryOp.NOTEQUAL;
			break;
		case "&&":
			binOp = BinaryOp.AND;
			break;
		case "||":
			binOp = BinaryOp.OR;
			break;
		default:
			//("This operator is not defined, please use one of those (*, /, +, -, <, >, <=, >=, ==, !=, &&, ||)");
		}
		return new BinaryExp(binOp, expr1, expr2);
	}
	
	public AST visitDefinition(CalcParser.DefinitionContext ctx) {
		
		//retrive AST for variableIds
		VariableId var = (VariableId) visit(ctx.variableId());
		
		Expression expr = (Expression) visit(ctx.expression());
		return new Definition(var, expr);
	}
	
	public AST visitLiteral(CalcParser.LiteralContext ctx) {
		return new IntLit(Integer.parseInt(ctx.getText()));
	}
	
	public AST visitCondExp(CalcParser.CondExpContext ctx) {
		// retrieve ASTs for expressions
		Expression exprCondition = (Expression) visit(ctx.expression().get(0));
		Expression exprCaseTrue = (Expression) visit(ctx.expression().get(1));
		Expression exprCaseFalse = (Expression) visit(ctx.expression().get(2));
		return new CondExp(exprCondition, exprCaseTrue, exprCaseFalse);
	}
	
	public AST visitVariable(CalcParser.VariableContext ctx) {
		VariableId id = (VariableId) visit(ctx.variableId());
		return new Variable(id, ctx.getText());
	}
	
	public AST visitParentheses(CalcParser.ParenthesesContext ctx) {
		return new Parentheses((Expression) visit(ctx.expression()));
	}
	
	public AST visitFunctionId(CalcParser.FunctionIdContext ctx) {
		return new FunctionId(ctx.getText());
	}
	
	public AST visitVariableId(CalcParser.VariableIdContext ctx) {
		return new VariableId(ctx.getText());
	}
	
	public AST visitHead(CalcParser.HeadContext ctx) {
		String id = ctx.functionId().getText();
		
		//retrieve AST for variableIds
		List<VariableIdContext> variableIdCtxs = ctx.variableId();
		List<VariableId> args = new ArrayList<VariableId>();
		for (VariableIdContext variableIds : variableIdCtxs) {
			args.add((VariableId) visit(variableIds));
		}
		
		return new Head(new FunctionId(id), args);
	}
	
}
