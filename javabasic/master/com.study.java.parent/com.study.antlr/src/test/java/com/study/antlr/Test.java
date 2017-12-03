package com.study.antlr;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Test {
    public static void main(String[] args)
    {
        String sentence = "{1,9, 1}";

        ArrayInitLexer lexer = new ArrayInitLexer(new ANTLRInputStream(sentence));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), tree);

        System.out.println();
    }
}
