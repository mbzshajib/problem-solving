package com.mbzshajib.problem.leet;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 3:48 PM.
 */
public class CheckIfNumbersAreAscendingInASentence_Solution {
    public boolean areNumbersAscending(String s) {
        if (s.isEmpty()) return true;
        String[] splited = s.split(" ");
        int lastNumber = 0;
        for (int i = 0; i < splited.length; i++) {
            if (isNumber(splited[i])) {
                if (Integer.valueOf(splited[i]) > lastNumber) {
                    lastNumber = Integer.valueOf(splited[i]);
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isNumber(String s) {
        char[] chars = s.toCharArray();
        List<Character> validInput = Arrays.asList(
                '0',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9'
        );
        for (Character input : chars) {
            if (!validInput.contains(input)) return false;
        }
        return true;
    }
}
