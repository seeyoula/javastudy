package com.study.java.design.patten.strategy;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Context {
    /**
     * 抽象策略
     */
    private Strategy strategy = null;

    /**
     * 构造函数设置具体策略
     *
     * @param _strategy 具体的策略
     */
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doAnythinig() {
        this.strategy.doSomething();
    }
}
