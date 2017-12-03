/*
 * 文件名：InsertionSortTest.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InsertionSortTest.java
 * 修改人：Administrator
 * 修改时间：2017年6月17日
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
 * @version    SBS V001R001 2017年6月17日
 * @since      SBS V001R001C00
 */
public class InsertionSortTest
{
    @Test
    public void test_InsertionSort_001()
    {
        int[] args = {3, 2, 1, 7, 5, 6, 9, 8, 0, 4};
        InsertionSort.sort(args);
        for (int i = 0; i < args.length; i++)
        {
            Assert.assertEquals(i, args[i]);
        }
    }
}
