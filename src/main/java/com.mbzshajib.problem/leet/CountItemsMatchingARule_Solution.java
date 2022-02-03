package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:38 AM.
 */
public class CountItemsMatchingARule_Solution {
    private static final Map<String, Integer> mapping = new HashMap<>();

    static {
        mapping.put("type", 0);
        mapping.put("color", 1);
        mapping.put("name", 2);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        Integer index = mapping.get(ruleKey);
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) result++;

        }
        return result;
    }
}
