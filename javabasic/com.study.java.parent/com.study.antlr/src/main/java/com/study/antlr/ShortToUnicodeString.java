package com.study.antlr;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by Administrator on 2017/8/1.
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {
    @Override
    public void enterInit(@NotNull ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitInit(@NotNull ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterValue(@NotNull ArrayInitParser.ValueContext ctx) {
        if(ctx.INT() == null)
        {
            System.out.print(ctx.INT());
        }
        else
        {
            System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
        }
    }
}
