/*
 * 文件名：SelectionSortTest.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： SelectionSortTest.java
 * 修改人：Administrator
 * 修改时间：2017年5月30日
 * 修改内容：新增
 */
package com.study.java.arithmetic.sort;

import org.junit.Test;

import junit.framework.Assert;

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
 * @version    SBS V001R001 2017年5月30日
 * @since      SBS V001R001C00
 */
public class SelectionSortTest
{
    @Test
    public void test_SelectionSort_sort()
    {
        int[] args = {3, 2, 1, 7, 5, 6, 9, 8, 0, 4};
        SelectionSort.sort(args);
        for (int i = 0; i < args.length; i++)
        {
            System.out.print(args[i]);
            Assert.assertEquals(i, args[i]);
        }
    }
}
