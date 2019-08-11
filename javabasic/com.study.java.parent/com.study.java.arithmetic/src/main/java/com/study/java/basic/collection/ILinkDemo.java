/*
 * 文件名：ILinkDemo.java
 * 版权：Copyright 2018-2020 com.study.java.parent Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ILinkDemo.java
 * 修改人：Administrator
 * 修改时间：2018/5/6
 */
package com.study.java.basic.collection;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version com.study.java.parent V001R001 2018/5/6
 */
public interface ILinkDemo
{
    void handle(ITarget target);

    void setNext(ILinkDemo linkDemo);
}
