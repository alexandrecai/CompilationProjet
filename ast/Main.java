package ast;

import gen.julLexer;
import gen.julParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visiteur.TableBuilder;
import visiteur.TypeChecker;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        String file = args[0];
        InputStream is = new FileInputStream(file);
        ParseTree tree = parse(is);
        AstBuild astB = new AstBuild();
        Program ast = (Program) tree.accept(astB);
        AstPrinter p = new AstPrinter();
        ast.accept(p);
        System.out.println(ast.accept(p));
        TableBuilder table = new TableBuilder();
        ast.accept(table);
        TypeChecker ts = new TypeChecker(table.getTable());
        ast.accept(ts);
        System.out.println("Votre programme ne contient pas d'erreur");
    }

    private static ParseTree parse(InputStream is) throws IOException {
        CharStream input = CharStreams.fromStream(is);
        julLexer lexer= new julLexer(input);
        CommonTokenStream lexemes = new CommonTokenStream(lexer);
        julParser parser = new julParser(lexemes);
        return parser.program();
    }
}
