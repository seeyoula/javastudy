package com.study.java.design.patten.strategy;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestEnumCalc {
    @Test
    public void testEnumCalc() {
        String[] args = new String[]{"10", "+", "5"};

        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        System.out.println("运行结果为：" + a + symbol + b + "=" + EnumCalculator.ADD.exec(a, b));
    }
}
