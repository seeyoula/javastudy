/*
 * �ļ�����InsertionSort.java
 * ��Ȩ��Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * ������ InsertionSort.java
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2017��5��28��
 * �޸����ݣ�����
 */
package com.study.java.arithmetic.sort;

/**
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @since      SBS V001R001C00
 */
public class InsertionSort
{
    public static void sort(int[] args)
    {
        for (int i = 1; i < args.length; i++)
        {
            int temp = args[i];
            int j = i - 1;
            while (j >= 0 && args[j] > temp)
            {
                // ����j��Ԫ�غ���
                args[j + 1] = args[j];
                j--;
            }
            args[j + 1] = temp;
        }
    }
    
    
}
