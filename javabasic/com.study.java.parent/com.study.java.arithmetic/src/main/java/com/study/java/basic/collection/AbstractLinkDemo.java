/*
 * 文件名：AbstractLinkDemo.java
 * 版权：Copyright 2018-2020 com.study.java.parent Tech. Co. Ltd. All Rights Reserved. 
 * 描述： AbstractLinkDemo.java
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
public abstract class AbstractLinkDemo implements ILinkDemo
{
    private ILinkDemo next;

    @Override
    public void handle(ITarget target)
    {
        if (this.match(target))
        {
            doHandle(target);
        }
        else
        {
            this.next.handle(target);
        }
    }

    protected abstract boolean match(ITarget target);

    protected abstract void doHandle(ITarget target);

    @Override
    public void setNext(ILinkDemo linkDemo)
    {
        this.next = linkDemo;
    }
}
