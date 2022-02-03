package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/28/2022 at 12:56 AM.
 */
public class FindCommonCharacters_Solution {
    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        if (A == null || A.length == 0) {
            return result;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : A[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < A.length; i++) {
            map = prepareWordMap(A[i], map);
        }
        for (Character key : map.keySet()) {
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                result.add(String.valueOf(key));
            }
        }
        return result;
    }

    private static Map<Character, Integer> prepareWordMap(String s, Map<Character, Integer> map) {
        Map<Character, Integer> tmp = new HashMap<>();
        for (char c : s.toCharArray()) {
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> result = new HashMap<>();
        for (Character key : map.keySet()) {
            if (tmp.containsKey(key)) {
                result.put(key, Math.min(map.get(key), tmp.get(key)));
            }
        }
        return result;
    }
}
