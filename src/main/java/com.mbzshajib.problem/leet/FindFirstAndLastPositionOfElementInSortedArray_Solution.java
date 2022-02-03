package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:49 PM.
 */
public class FindFirstAndLastPositionOfElementInSortedArray_Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int minResult = -1, maxResult = -1;
        long low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (int) ((high + low) / 2);
            if (nums[mid] < target) {
                low = mid + 1;
            } else high = mid;
        }
        if (nums[(int) low] == target) minResult = (int) low;
        else return new int[]{-1,-1};
        for (int i = minResult; i < nums.length; i++) {
            if (nums[i] == target) maxResult = i;
        }
        return new int[]{minResult, maxResult};
    }
}
