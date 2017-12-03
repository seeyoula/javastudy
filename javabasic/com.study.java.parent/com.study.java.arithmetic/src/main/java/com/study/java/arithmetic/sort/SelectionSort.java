/*
 * 文件名：SelectionSort.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： SelectionSort.java
 * 修改人：Administrator
 * 修改时间：2017年5月30日
 * 修改内容：新增
 */
package com.study.java.arithmetic.sort;

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
