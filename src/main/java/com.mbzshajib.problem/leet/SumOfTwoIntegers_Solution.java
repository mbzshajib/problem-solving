package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/30/2022 at 7:10 PM.
 */
public class SumOfTwoIntegers_Solution {
    public int getSum(int a, int b) {
        int result = 0;
        int counter = 0;
        while (a != 0 || b != 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            result = ((digitA + digitB) * (int) Math.pow(10, counter++)) + result;
            a = a / 10;
            b = b / 10;
        }
        return result;
    }
}
