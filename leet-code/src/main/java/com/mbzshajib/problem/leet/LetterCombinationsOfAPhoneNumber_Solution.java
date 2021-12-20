package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/9/21 at 11:06 AM.
 */
public class LetterCombinationsOfAPhoneNumber_Solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2379"));
    }

    public static List<String> letterCombinations(String digits) {
        String[][] dictionary = new String[][]{
                {},
                {},
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}};
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        if (digits.length() == 1) return Arrays.asList(dictionary[Integer.parseInt(digits)]);
        //abc
        for (int i = digits.length() - 1; i >= 0; i--) {
            int digitNoChar =Integer.parseInt(digits.charAt(i) + "");
            List<String> one = Arrays.asList(dictionary[digitNoChar]);
            result = getList(one, result);
        }

        return result;
    }

    public static List<String> getList(List<String> one, List<String> two) {
        if(two.isEmpty()){
            return one;
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < one.size(); i++) {
            for (int j = 0; j < two.size(); j++) {
                result.add(one.get(i) + two.get(j));
            }
        }
        return result;
    }
}
