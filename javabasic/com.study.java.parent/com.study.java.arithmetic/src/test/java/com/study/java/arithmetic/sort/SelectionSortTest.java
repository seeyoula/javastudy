/*
 * �ļ�����SelectionSortTest.java
 * ��Ȩ��Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * ������ SelectionSortTest.java
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2017��5��30��
 * �޸����ݣ�����
 */
package com.study.java.arithmetic.sort;

import org.junit.Test;

import junit.framework.Assert;

/**
 * TODO ������һ�仰��������
 * <p>
 * TODO ��ϸ����
 * <p>
 * TODO ʾ������
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2017��5��30��
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
