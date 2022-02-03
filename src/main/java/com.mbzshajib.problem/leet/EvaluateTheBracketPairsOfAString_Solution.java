package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 6:22 PM.
 */
public class EvaluateTheBracketPairsOfAString_Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder result = new StringBuilder();
        Map<String, String> knowledgeMap = new HashMap<>();
        for (List<String> pair : knowledge) {
            knowledgeMap.put(pair.get(0), pair.get(1));
        }
        StringBuilder replacableWord = new StringBuilder();
        boolean replacableWordStarted = false;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(') {
                replacableWordStarted = true;
                continue;
            } else if (currChar == ')') {
                replacableWordStarted = false;
                String replacedWord = knowledgeMap.getOrDefault(replacableWord.toString(), "?");
                result.append(replacedWord);
                replacableWord = new StringBuilder();
                continue;
            } else {
                if (replacableWordStarted) replacableWord.append(currChar);
                else result.append(currChar);
            }
        }
        return result.toString();
    }
}
