/*
 * 文件名：FindMedianSortedArrays.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： FindMedianSortedArrays
 * 修改人：Administrator
 * 修改时间：2019/9/28
 */
package com.study.leetcode.medium;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * <p>
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version com.study.java.parent 2019/9/28
 */
public class FindMedianSortedArrays
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n)
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax)
        {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j - 1] > nums1[i])
            {
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && nums1[i - 1] > nums2[j])
            {
                iMax = i - 1; // i is too big
            }
            else
            { // i is perfect
                int maxLeft = 0;
                if (i == 0)
                {
                    maxLeft = nums2[j - 1];
                }
                else if (j == 0)
                {
                    maxLeft = nums1[i - 1];
                }
                else
                {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1)
                {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m)
                {
                    minRight = nums2[j];
                }
                else if (j == n)
                {
                    minRight = nums1[i];
                }
                else
                {
                    minRight = Math.min(nums2[j], nums1[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
