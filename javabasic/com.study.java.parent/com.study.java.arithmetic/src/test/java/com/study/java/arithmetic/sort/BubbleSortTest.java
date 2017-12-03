/*
 * 文件名：BubbleSortTest.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BubbleSortTest.java
 * 修改人：Administrator
 * 修改时间：2017年5月28日
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
 * @version    SBS V001R001 2017年5月28日
 * @since      SBS V001R001C00
 */
public class BubbleSortTest
{
    @Test
    public void test_BubbleSort_sort()
    {
        int[] args = {3, 2, 1, 7, 5, 6, 9, 8, 0, 4};
        int[] target = BubbleSort.sort(args);
        for (int i = 0; i < target.length; i++)
        {
            Assert.assertEquals(i, target[i]);
        }
    }
    
    @Test
    public void test_BubbleSort_sortAsc()
    {
        int[] args = {3, 2, 1, 7, 5, 6, 9, 8, 0, 4};
        BubbleSort.sortAsc(args);
        for (int i = 0; i < args.length; i++)
        {
            Assert.assertEquals(i, args[i]);
        }
    }
    
    @Test
    public void test_BubbleSort_sortWithCocktail()
    {
        int[] args = {3, 2, 1, 7, 5, 6, 9, 8, 0, 4};
        BubbleSort.sortWithCocktail(args);
        for (int i = 0; i < args.length; i++)
        {
            Assert.assertEquals(i, args[i]);
        }
    }
}
