package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 11:06 AM.
 */
public class SearchInRotatedSortedArray_Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[min] <= nums[mid]) {
                if (nums[min] <= target && target < nums[mid])
                    max = mid - 1;
                else min = mid + 1;
            } else if (nums[mid] <= nums[max]) {
                if (nums[mid] < target && target <= nums[max])
                    min = mid + 1;
                else max = mid - 1;
            }
        }
        return -1;
    }

}
