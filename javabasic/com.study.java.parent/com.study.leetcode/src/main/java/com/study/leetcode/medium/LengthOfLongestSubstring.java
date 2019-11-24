/*
 * 文件名：LengthOfLongestSubstring.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： LengthOfLongestSubstring
 * 修改人：Administrator
 * 修改时间：2019/9/28
 */
package com.study.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

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
 * @version com.study.java.parent 2019/9/28
 */
public class LengthOfLongestSubstring
{
    public int lengthOfLongestSubstring(String s)
    {
        int max = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length())
        {
            if (!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
