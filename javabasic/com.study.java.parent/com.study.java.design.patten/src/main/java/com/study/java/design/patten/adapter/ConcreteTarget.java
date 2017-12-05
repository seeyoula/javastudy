package com.study.java.design.patten.adapter;

/**
 * Created by Administrator on 2017/12/5.
 */
public class ConcreteTarget implements Target
{
    @Override
    public void request()
    {
        System.out.println("if you need any help, pls call me!");
    }
}
