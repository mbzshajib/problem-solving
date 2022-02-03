package com.mbzshajib.problem.leet;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 */
public class RemoveDuplicatesFromSortedArray_Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int result = 1;
        int position = 1;
        for (int counter = 1; counter < nums.length; counter++) {
            if (nums[counter] != nums[counter - 1]) {
                nums[position++] = nums[counter];
                result++;
            }
        }
        return result;
    }
}
