/*
 * 文件名：LinkedDemoClient.java
 * 版权：Copyright 2018-2020 com.study.java.parent Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LinkedDemoClient.java
 * 修改人：Administrator
 * 修改时间：2018/5/6
 */
package com.study.java.basic.collection;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version com.study.java.parent V001R001 2018/5/6
 */
public class LinkedDemoClient
{
    public static void main(String[] args)
    {
        ILinkDemo linkDemo1 = new LinkDemoImpl1();
        linkDemo1.setNext(new LinkDemoImpl2());

        ITarget t = new TargetImpl1();
        linkDemo1.handle(t);

        t = new TargetImpl2();
        linkDemo1.handle(t);
    }
}
