package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 1:07 PM.
 */
public class FindTheDuplicateNumber_Solution {
    public int findDuplicate(int[] nums) {
        int min = 1, max = nums.length - 1;
        int duplicate = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }
            if (mid < count) {
                duplicate = mid;
                max = mid - 1;
            } else min = mid + 1;
        }
        return duplicate;
    }
}
