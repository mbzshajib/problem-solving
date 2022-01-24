package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 6:44 PM.
 */
public class CheckIfArrayIsSortedAndRotated_Solution {
    public boolean check(int[] nums) {
        int counter = 0;
        if (nums[0] < nums[nums.length - 1]) counter++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) counter++;
        }
        return counter > 1 ? false : true;
    }
}
