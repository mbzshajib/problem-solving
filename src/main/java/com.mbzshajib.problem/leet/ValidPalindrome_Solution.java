package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 11:30 AM.
 */
public class ValidPalindrome_Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty() || s.length() == 1) return true;
        char[] input = s.toCharArray();
        int start = 0, end = input.length - 1;
        while (start <= end) {
            if (!isAlphaNumeric(input[start])) {
                start++;
                continue;
            }
            if (!isAlphaNumeric(input[end])) {
                end--;
                continue;
            }
            if (input[start] != input[end]) return false;
            start++;
            end--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        if (('0' <= c && c <= '9') || ('a' <= c && c <= 'z')) {
            return true;
        }
        return false;
    }
}
