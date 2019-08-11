/*
 * 文件名：LinkDemoImpl1.java
 * 版权：Copyright 2018-2020 com.study.java.parent Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LinkDemoImpl1.java
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
public class LinkDemoImpl1 extends AbstractLinkDemo
{
    @Override
    protected boolean match(ITarget target)
    {
        return target instanceof TargetImpl1;
    }

    @Override
    protected void doHandle(ITarget target)
    {
        System.out.println("Handle class : " + this.getClass());
    }
}
