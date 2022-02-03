package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/28/2022 at 1:56 AM.
 */
public class N_thTribonacciNumber_Solution {
    public static final Map<Integer, Integer> map = new HashMap<>();

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        if (!map.containsKey(n)) map.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
        return map.get(n);
    }
}
