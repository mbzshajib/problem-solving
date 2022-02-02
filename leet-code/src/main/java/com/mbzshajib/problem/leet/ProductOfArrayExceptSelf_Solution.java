package com.mbzshajib.problem.leet;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 11:57 PM.
 */
public class ProductOfArrayExceptSelf_Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int numOfZero = 0;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numOfZero++;
                zeroIndex = i;
                if (numOfZero > 1) {
                    zeroIndex = -1;
                    break;
                }
                continue;
            }
            product = product * nums[i];

        }
        if (zeroIndex == 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) product / nums[i];
            }
        } else {
            Arrays.fill(nums, 0);
            if (numOfZero == 1) {
                nums[zeroIndex] = (int) product;
            }
        }
        return nums;
    }
}
