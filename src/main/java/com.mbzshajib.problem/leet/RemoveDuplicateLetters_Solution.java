package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/6/2022 at 12:10 AM.
 */
public class RemoveDuplicateLetters_Solution {
    public String removeDuplicateLetters(String S) {
        Stack<Integer> stack = new Stack<>();

        int[] last = new int[26], seen = new int[26];

        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        //bcabc
        //cbacdcbc
        for (int i = 0; i < S.length(); ++i) {
            int currChar = S.charAt(i) - 'a';
            if (seen[currChar]++ > 0) continue;
            while (!stack.isEmpty() && stack.peek() > currChar && i < last[stack.peek()])
                seen[stack.pop()] = 0;
            stack.push(currChar);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack) sb.append((char) ('a' + i));
        Iterator<Map.Entry<Integer, Integer>> iterator = new HashMap<Integer, Integer>().entrySet().iterator();
        return sb.toString();
    }

}
