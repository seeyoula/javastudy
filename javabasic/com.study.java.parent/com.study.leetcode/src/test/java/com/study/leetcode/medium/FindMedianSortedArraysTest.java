/*
 * 文件名：FindMedianSortedArraysTest.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： FindMedianSortedArraysTest
 * 修改人：Administrator
 * 修改时间：2019/9/28
 */
package com.study.leetcode.medium;

import org.junit.Assert;
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
 * @author Administrator
 * @version com.study.java.parent 2019/9/28
 */
public class FindMedianSortedArraysTest
{
    @Test
    public void test_findMedianSortedArrays()
    {
        FindMedianSortedArrays fmsa = new FindMedianSortedArrays();
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println(fmsa.findMedianSortedArrays(nums1, nums2));
        Assert.assertTrue(2.0 == fmsa.findMedianSortedArrays(nums1, nums2));
    }
}
