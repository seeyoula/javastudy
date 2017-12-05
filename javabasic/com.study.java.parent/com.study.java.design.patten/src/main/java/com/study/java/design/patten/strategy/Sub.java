package com.study.java.design.patten.strategy;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
