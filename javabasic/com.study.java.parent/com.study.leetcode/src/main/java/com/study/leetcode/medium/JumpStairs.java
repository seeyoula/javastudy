/*
 * 文件名：JumpStairs.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： JumpStairs
 * 修改人：Administrator
 * 修改时间：2019/10/1
 */
package com.study.leetcode.medium;

/**
 * 跳楼梯方法
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version com.study.java.parent 2019/10/1
 */
public class JumpStairs
{
    public int jumpStairs(int n)
    {
        if (n < 3)
        {
            return 1;
        }
        if (n == 3)
        {
            return 2;
        }
        int[] count = new int[n + 1];
        count[1] = 1;
        count[2] = 1;
        count[3] = 2;

        for (int i = 4; i <= n; i++)
        {
            count[i] = count[i - 1] + count[i - 3];
        }
        return count[n];
    }
}
