package com.study.java.design.patten.strategy;

/**
 * Created by Administrator on 2017/12/5.
 */
public class ConcreteStrategy2 implements Strategy
{
    /**
     * 策略模式的运算法则
     */
    @Override
    public void doSomething()
    {
        System.out.println("具体策略2的运算法则");
    }
}
