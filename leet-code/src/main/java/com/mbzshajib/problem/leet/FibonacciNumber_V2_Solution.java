package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 4:44 PM.
 */
public class FibonacciNumber_V2_Solution {
    private static final Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        if (!map.containsKey(n))
            map.put(n, fib(n - 1) + fib(n - 2));
        return map.get(n);
    }
}
