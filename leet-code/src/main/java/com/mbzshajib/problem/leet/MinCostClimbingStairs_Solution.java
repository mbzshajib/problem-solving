package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 5:13 PM.
 */
public class MinCostClimbingStairs_Solution {

    public int minCostClimbingStairs(int[] cost) {
        int result[] = new int[cost.length];
        result[0] = cost[0];
        result[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            result[i] = Math.min(result[i - 1], result[i - 2]) + cost[i];
        }
        return Math.min(result[cost.length - 1], result[cost.length - 2]);
    }
}
