package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/14/21 at 5:45 PM.
 */
public class Sqrtx_Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int target) {
        if (target < 0) return -1;
        if (target == 0) return 0;
        if (target == 1) return 1;
        long from = 1;
        long to = target / 2;
        int loopcounter = 1;
        while (from <= to) {
            long mid =( from + to) / 2;
//            System.out.println("loop count " + loopcounter+++" from "+from+" mid "+mid+" to "+to);
            System.out.println("("+from+"+"+to+")/2 = "+mid);
            long midSqr = mid * mid;
            long midM1Sqr = (mid - 1) * (mid - 1);
            long midP1Sqr = (mid + 1) * (mid + 1);

            if (mid * mid == target) return (int)mid;
            if (midM1Sqr < target && target < midSqr) return (int)(mid - 1);
            if (midSqr < target && target < midP1Sqr) return (int) mid;
            if (midSqr < target) from = mid + 1;
            else to = mid;
        }
        return -1;
    }

}
