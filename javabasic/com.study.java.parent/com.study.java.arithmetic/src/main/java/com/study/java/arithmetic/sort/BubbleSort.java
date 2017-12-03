/*
 * 文件名：BubbleSort.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BubbleSort.java
 * 修改人：Administrator
 * 修改时间：2017年5月28日
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
 * @version    SBS V001R001 2017年5月28日
 * @since      SBS V001R001C00
 */
public class BubbleSort
{
    public static int[] sort(int[] args)
    {
        for (int i = 0, j = 1; i < args.length; i++)
        {
            int temp = args[i];
            int k = 0;
            for (; j < args.length; j++)
            {
                if (temp > args[j])
                {
                    temp = args[j];
                    k = j;
                }
            }
            if (temp == args[i])
            {
                j = i + 1;
                continue;
            }
            else
            {
                args[k] = args[i];
                args[i] = temp;
                j = i + 1;
            }
        }
        return args;
    }
    
    public static int[] sortAsc(int[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            for (int j = 0; j < args.length - 1 - i; j++)
            {
                if (args[j] > args[j + 1])
                {
                    exchange(args, j, j + 1);
                }
            }
        }
        return args;
    }
    
    public static int[] sortWithCocktail(int[] args)
    {
        int left = 0;
        int right = args.length - 1;
        while (left < right)
        {
            for (int i = left; i < right; i++)
            {
                if (args[i] > args[i + 1])
                {
                    exchange(args, i, i + 1);
                }
            }
            right--;
            
            for (int i = right; i > left; i--)
            {
                if (args[i] < args[i - 1])
                {
                    exchange(args, i, i - 1);
                }
            }
            left++;
        }
        
        return args;
    }
    
    private static void exchange(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
