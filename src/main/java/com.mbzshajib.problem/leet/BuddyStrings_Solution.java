package com.mbzshajib.problem.leet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/5/2022 at 5:18 PM.
 */
public class BuddyStrings_Solution {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length() || a.length() == 1) return false;

        Set<Character> hashSet = new HashSet<>();
        int j = -1, w = -1;
        for (int i = 0; i < a.length(); hashSet.add(a.charAt(i++))) {
            if (a.charAt(i) == b.charAt(i)) continue;
            if (w != -1 && j != -1) return false;
            if (w == -1 && j != -1) w = i;
            if (j == -1) j = i;
        }

        if (w == -1 && j == -1)
            return hashSet.size() != a.length();
        if (w == -1 || j == -1) return false;
        return a.charAt(w) == b.charAt(j) && a.charAt(j) == b.charAt(w);
    }
}
