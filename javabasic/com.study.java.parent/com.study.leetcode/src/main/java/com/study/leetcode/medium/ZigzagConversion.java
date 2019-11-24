/*
 * 文件名：ZigzagConversion.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： ZigzagConversion
 * 修改人：Administrator
 * 修改时间：2019/10/1
 */
package com.study.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class ZigzagConversion
{
    public String convert(String s, int numRows)
    {
        if (numRows <= 0)
        {
            return null;
        }
        if (numRows == 1)
        {
            return s;
        }
        if (s.isEmpty())
        {
            return s;
        }
        Map<Integer, StringBuffer> sbMap = new HashMap<>();
        for (int i = 0; i < numRows; i++)
        {
            sbMap.putIfAbsent(i, new StringBuffer());
        }


        return null;
    }
}
