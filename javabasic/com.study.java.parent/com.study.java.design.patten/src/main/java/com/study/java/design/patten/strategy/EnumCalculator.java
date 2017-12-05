package com.study.java.design.patten.strategy;

/**
 * Created by Administrator on 2017/12/5.
 */
public enum EnumCalculator {
    //加法运算
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    //减法运算
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };
    String value = "";

    /**
     * 定义成员值类型
     * @param _value
     */
    private EnumCalculator(String _value) {
        this.value = _value;
    }

    /**
     * 获得枚举成员的值
     * @return
     */
    public String getValue() {
        return this.value;
    }

    /**
     * 声明一个抽象函数
     * @param a
     * @param b
     * @return
     */
    public abstract int exec(int a, int b);
}
