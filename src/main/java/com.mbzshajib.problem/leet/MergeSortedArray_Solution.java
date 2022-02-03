package com.mbzshajib.problem.leet;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/9/21 at 12:56 PM.
 */
public class MergeSortedArray_Solution {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, -1, -1, -1}, 3, new int[]{2, 5, 6}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, counter = nums1.length - 1;
        for (; i >= 0 && j >= 0; counter--) {
            if (nums1[i] > nums2[j]) {
                nums1[counter] = nums1[i--];
            } else {
                nums1[counter] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[counter--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[counter--] = nums2[j--];
        }
    }
}
