package com.study.java.design.patten.adapter;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Adapter extends Adaptee implements Target
{
    @Override
    public void request()
    {
        super.doSomething();
    }
}
