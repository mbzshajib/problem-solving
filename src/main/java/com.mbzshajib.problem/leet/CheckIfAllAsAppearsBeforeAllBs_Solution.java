package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:40 PM.
 */
public class CheckIfAllAsAppearsBeforeAllBs_Solution {
    public boolean checkString(String s) {
        if (s.isEmpty()) return true;
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) return false;
        }
        return true;
    }
}
