package com.study.java.design.patten.strategy;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestStrategy {
    @Test
    public void testStrategy() {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnythinig();
    }
}
