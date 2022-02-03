package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 4:21 PM.
 */
public class ClimbingStairs_BottomUp_Solution {

    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n - 1];

    }
}
