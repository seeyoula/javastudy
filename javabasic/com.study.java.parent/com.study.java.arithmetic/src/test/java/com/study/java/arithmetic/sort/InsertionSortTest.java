/*
 * �ļ�����InsertionSortTest.java
 * ��Ȩ��Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * ������ InsertionSortTest.java
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2017��6��17��
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
 * @version    SBS V001R001 2017��6��17��
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
