/*
 * 文件名：LinkDemoManager.java
 * 版权：Copyright 2018-2020 com.study.java.parent Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LinkDemoManager.java
 * 修改人：Administrator
 * 修改时间：2018/5/6
 */
package com.study.java.basic.collection;

import java.util.LinkedList;

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
public class LinkDemoManager
{
    private static LinkedList<ILinkDemo> linkDemos = new LinkedList<>();

    public static void add(ILinkDemo demo)
    {
        linkDemos.addLast(demo);
    }

    public static void add(int index, ILinkDemo demo)
    {
        linkDemos.add(index, demo);
    }

}
