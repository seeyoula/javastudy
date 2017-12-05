package com.study.java.design.patten.strategy;

/**
 * Created by Administrator on 2017/12/5.
 */
public class CalcContext {
    private Calculator cal = null;

    public CalcContext(Calculator _cal) {
        this.cal = _cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
