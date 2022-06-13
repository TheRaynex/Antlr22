import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class CalcMain {

    //antlr Calc.g4 -o compiler -package compiler
    public static void main(String[] args) throws IOException {
        //create input stream
        CharStream input = CharStreams.fromFileName(args[0]);
        //create lexer
        compiler.CalcLexer lexer = new compiler.CalcLexer(input);
        //create token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //create parser
        compiler.CalcParser parser = new compiler.CalcParser(tokens);
        parser.setBuildParseTree(true);
        //build parse tree
        ParseTree tree = parser.sumExpr();
        //output parse tree
        System.out.println(tree.toStringTree(parser));
        //build tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        //visit tree
        walker.walk(new MyCalcListener(), tree);

    }
}
