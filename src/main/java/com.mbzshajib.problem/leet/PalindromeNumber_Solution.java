package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:46 PM.
 */
public class PalindromeNumber_Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        if (x < 0) return false;
        else if (x < 10) return true;
        else {
            int num = x;
            while (num != 0) {
                int mod = num % 10;
                num = num / 10;
                sum = sum * 10 + mod;
            }
        }
        return x == sum;
    }
}
