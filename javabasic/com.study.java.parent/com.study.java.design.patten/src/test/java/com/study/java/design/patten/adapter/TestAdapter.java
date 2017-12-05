package com.study.java.design.patten.adapter;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestAdapter
{
    @Test
    public void testAdapter()
    {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        // 现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
