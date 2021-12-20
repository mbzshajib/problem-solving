package com.mbzshajib.problem.leet;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 */
public class PlusOne_Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,8,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,8})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,9,8,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,9,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        boolean carry = false;
        int val = digits[digits.length - 1] + 1;
        digits[digits.length - 1] = val % 10;
        if (val == 10) carry = true;
        for (int pos = digits.length - 2; pos >= 0; pos--) {
            val = digits[pos];
            if (carry) val = val + 1;
            if (val == 10) carry = true;
            else carry = false;
            digits[pos] = val % 10;
        }
        if (!carry) return digits;
        else {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = 1;
            return result;
        }
    }
}
