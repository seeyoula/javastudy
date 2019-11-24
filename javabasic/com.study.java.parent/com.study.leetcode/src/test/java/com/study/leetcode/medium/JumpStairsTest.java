/*
 * 文件名：JumpStairsTest.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： JumpStairsTest
 * 修改人：Administrator
 * 修改时间：2019/10/1
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
 * @version com.study.java.parent 2019/10/1
 */
public class JumpStairsTest
{
    @Test
    public void test_jumpStairs()
    {
        Assert.assertEquals(3, new JumpStairs().jumpStairs(4));
        Assert.assertEquals(4, new JumpStairs().jumpStairs(5));
        Assert.assertEquals(6, new JumpStairs().jumpStairs(6));
        Assert.assertEquals(9, new JumpStairs().jumpStairs(7));
    }
}
