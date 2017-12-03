/*
 * 文件名：Singleton.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Singleton.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.singleton;

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
public class InnerStaticClassSingleton
{
    private InnerStaticClassSingleton()
    {
        init();
    }
    
    private void init()
    {
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
        }
        System.out.println("Singleton is initalizing.");
    }
    
    private static class SingletonFactory
    {
        private static InnerStaticClassSingleton instance = new InnerStaticClassSingleton();
    }
    
    public static InnerStaticClassSingleton getInstance()
    {
        return SingletonFactory.instance;
    }
}
