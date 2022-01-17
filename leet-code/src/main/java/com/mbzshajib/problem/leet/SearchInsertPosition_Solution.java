package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/17/2022 at 6:30 PM.
 */
public class SearchInsertPosition_Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) min = mid + 1;
            if (nums[mid] > target) max = mid - 1;
        }
        return min;
    }
}
