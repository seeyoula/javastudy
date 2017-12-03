/*
 * 文件名：InsertionSort.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InsertionSort.java
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
                // 将第j个元素后移
                args[j + 1] = args[j];
                j--;
            }
            args[j + 1] = temp;
        }
    }
    
    
}
