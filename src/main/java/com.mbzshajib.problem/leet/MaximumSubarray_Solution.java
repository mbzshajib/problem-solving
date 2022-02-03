package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:27 PM.
 */
public class MaximumSubarray_Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int mem[] = new int[nums.length];
        mem[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            mem[i] = Math.max(nums[i], mem[i - 1] + nums[i]);
            result = Math.max(result, mem[i]);
        }

        return result;
    }
}
