package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:21 PM.
 */
public class ReverseInteger_Solution {
    public int reverse(int x) {
        if (x == 0) return x;
        long result = 0;
        int number = x;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            result = result * 10;
            result = result + digit;
            if (result > Integer.MAX_VALUE || result < -Integer.MAX_VALUE) {
                result = 0;
                break;
            }
        }

        return (int) result;
    }
}
