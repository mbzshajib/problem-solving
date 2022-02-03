package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:07 PM.
 */

public class SortingTheSentence_Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                map.put(Integer.valueOf(words[i].charAt(words[i].length() - 1))-48, words[i].substring(0, words[i].length() - 1));
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {

            result.append(map.get(i)).append(' ');
        }
        return result.substring(0, result.length() - 1);
    }
}
