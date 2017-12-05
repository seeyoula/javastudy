package com.study.java.design.patten.strategy;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestCalcStrategy {
    /**
     * + 符号
     */
    public final static String ADD_SYMBOL = "+";

    /**
     * 减符号
     */
    public final static String SUB_SYMBOL = "-";

    @Test
    public void testCalc() {
        String[] args = new String[]{"10", "+", "5"};

        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));

        //上下文
        CalcContext context = null;

        //判断初始化哪一个策略
        if (symbol.equals(ADD_SYMBOL)) {
            context = new CalcContext(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new CalcContext(new Sub());
        }
        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}
