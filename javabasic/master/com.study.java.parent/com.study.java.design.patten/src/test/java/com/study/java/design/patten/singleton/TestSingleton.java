/*
 * 文件名：TestSimpleSingleton.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestSimpleSingleton.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.singleton;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2016年5月2日
 * @since      SBS V001R001C00
 */
public class TestSingleton
{
    @Test
    public void test_Singleton_001()
    {
        List<SimpleSingleton> singletonList = new ArrayList<SimpleSingleton>();
        List<SingletonMultiThread> threads = new ArrayList<SingletonMultiThread>();
        for (int i = 0; i < 10000; i++)
        {
            SingletonMultiThread t = new SingletonMultiThread();
            threads.add(t);
        }
        
        for (int i = 0; i < threads.size(); i++)
        {
            threads.get(i).start();
        }
        
        System.out.println("*********************");
        
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        for (int i = 0; i < threads.size(); i++)
        {
            if (!singletonList.contains(threads.get(i).instance))
            {
                singletonList.add(threads.get(i).instance);
            }
        }
        
        System.out.println(singletonList.size());
        
        // 不是只含有一个实例
        Assert.assertTrue(1 != singletonList.size());
    }
    
    @Test
    public void test_Singleton_002()
    {
        Assert.assertTrue(true);
    }
}

class SingletonMultiThread extends Thread
{
    SimpleSingleton instance = null;
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public void run()
    {
        instance = SimpleSingleton.getInstance();
    }
}