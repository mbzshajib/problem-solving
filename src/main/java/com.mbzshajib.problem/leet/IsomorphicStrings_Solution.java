package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbzshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/7/21 at 4:27 PM.
 */
public class IsomorphicStrings_Solution {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphicOld(String s, String t) {
        boolean result = true;
        if (s == null || t == null) return false;
        if (s.isEmpty() || t.isEmpty()) return false;
        if (s.length() != t.length()) return false;
        Map<String, String> mapA = new HashMap<>();
        Map<String, String> mapB = new HashMap<>();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for (int i = 0; i < a.length; i++) {
            String mapValA = mapA.get(a[i] + "");
            if (mapValA == null) mapA.put(a[i] + "", b[i] + "");
            else {
                if (!mapValA.equals(b[i] + "")) return false;
            }
            String mapValB = mapB.get(b[i] + "");
            if (mapValB == null) mapB.put(b[i] + "", a[i] + "");
            else {
                if (!mapValB.equals(a[i] + "")) return false;
            }

        }
        return result;
    }

    public static boolean isIsomorphic(String s, String t) {
        Map hashMap = new HashMap();
        for (Integer i = 0; i < s.length(); ++i) {
            Object first = hashMap.put(s.charAt(i), i);
            Object second = hashMap.put(t.charAt(i) + "", i);
            if (first != second)
                return false;
        }
        return true;
    }
}
