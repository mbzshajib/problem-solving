package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:06 PM.
 */
public class ReverseWordsInAString_Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = splitted.length - 1; i >= 0; i--) {
            if (!splitted[i].isEmpty()) {
                builder.append(splitted[i]);
                builder.append(' ');
            }
        }
        String result = builder.toString();
        if (result.charAt(result.length() - 1) == ' ') result = result.substring(0, result.length() - 1);
        return result;
    }
}
