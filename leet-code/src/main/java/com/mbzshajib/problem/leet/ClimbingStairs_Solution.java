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
public class ClimbingStairs_Solution {
    private final Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 2) return n;
        if (!map.containsKey(n))
            map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return map.get(n);
    }
}
