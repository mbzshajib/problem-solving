package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/23/2022 at 5:49 PM.
 */
public class FindPeakElement_Solution {
    public int findPeakElement(int[] nums) {
        int min = 0, max = nums.length - 1;

        while (min<max){
            int mid = min+ (max-min)/2;
            if(nums[mid]>nums[mid+1])
                max = mid;
            else min = mid + 1;
        }
        return min;
    }
   /* public int findPeakElement(int[] nums) {
        int min = 0, max = nums.length - 1;

        while (min<max){
            int mid = min+ (max-min)/2;
            if(nums[mid]<nums[mid+1])
                min = mid + 1;
            else max = mid;
        }
        return min;
    }*/
}
