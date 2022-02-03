package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 1:23 PM.
 */
public class FindSmallestLetterGreaterThanTarget_Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = 0;
        int max = letters.length - 1;

        while (min <= max) {
            int middle = min + (max - min) / 2;

            if (letters[middle] > target) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
        }

        if (min >= 0 && min < letters.length)
            return letters[min];
        else return letters[0];
    }
}
