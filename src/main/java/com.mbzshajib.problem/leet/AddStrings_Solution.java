package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:24 PM.
 */
public class AddStrings_Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        char[] one = num1.toCharArray();
        char[] two = num2.toCharArray();
        int oneInHand = 0;
        for (int i = 0; i < Math.max(one.length, two.length); i++) {
            int oneIndex = one.length - 1 - i;
            int twoIndex = two.length - 1 - i;
            int char1 = 0, char2 = 0;
            if (oneIndex >= 0) char1 = one[oneIndex] - 48;
            if (twoIndex >= 0) char2 = two[twoIndex] - 48;
            int sum = char1 + char2 + oneInHand;
            if (sum > 9) oneInHand = 1;
            else oneInHand = 0;
            result.append((char) sum % 10);
        }
        if (oneInHand == 1) result.append('1');

        return result.reverse().toString();
    }
}
