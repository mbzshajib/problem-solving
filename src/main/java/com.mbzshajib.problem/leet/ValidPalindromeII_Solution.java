package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 11:45 AM.
 */
public class ValidPalindromeII_Solution {

    public boolean validPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty() || s.length() == 1) return true;
        return checkPalindrome(s, 0, s.length() - 1, false);
    }

    boolean checkPalindrome(String checkString, int start, int end, boolean skip) {
        while (start < end) {
            if (checkString.charAt(start) == checkString.charAt(end)) {
                start++;
                end--;
            } else {
                if (!skip) {
                    return checkPalindrome(checkString, start + 1, end, true) || checkPalindrome(checkString, start, end - 1, true);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
