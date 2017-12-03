/*
 * �ļ�����BubbleSortTest.java
 * ��Ȩ��Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * ������ BubbleSortTest.java
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2017��5��28��
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
 * @version    SBS V001R001 2017��5��28��
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
