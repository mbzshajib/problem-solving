package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 10:41 AM.
 */
public class FindMinimumInRotatedSortedArray_Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int min = 0, max = nums.length - 1;
        if (nums[0] < nums[max]) return nums[0];
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid-1] > nums[mid]) {
                return nums[mid ];
            }
            if (nums[0] < nums[mid])
                min = mid +1;
            else max = mid - 1;
        }
        return -1;
    }
}
