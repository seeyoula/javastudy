/*
 * �ļ�����SelectionSort.java
 * ��Ȩ��Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * ������ SelectionSort.java
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2017��5��30��
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
public class SelectionSort
{
    public static void sort(int[] args)
    {
        int min = 0;
        for (int i = 0; i < args.length - 1; i++)
        {
            min = i;
            for (int j = i; j < args.length; j++)
            {
                if (args[j] < args[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                exchange(args, min, i);
            }
        }
    }
    
    private static void exchange(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
