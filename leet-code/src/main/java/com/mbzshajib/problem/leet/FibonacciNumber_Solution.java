package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 4:44 PM.
 */
public class FibonacciNumber_Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if (n<=2)return 1;
        int result[] = new int[n];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n-1];
    }
}
