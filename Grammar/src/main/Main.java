package main;

import grammar.Eval;
import grammar.ExprLexer;
import grammar.ExprParser;

import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Main {
	public static void main(String args[]) {
		try {
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ExprParser parser = new ExprParser(tokens);
			ExprParser.prog_return r = parser.prog();
			CommonTree t = (CommonTree) r.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
			Eval walker = new Eval(nodes);
			walker.prog();
		} catch (IOException e) {
		} catch (RecognitionException e) {
		}
	}
}
