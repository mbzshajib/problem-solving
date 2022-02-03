package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:26 AM.
 */
public class LengthOfLastWord_Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int tmpResult = 0;
        for (char c : chars) {
            if (c == ' ') {
                if (tmpResult != 0) result = tmpResult;
                tmpResult = 0;
            } else ++tmpResult;
        }
        if(tmpResult!=0)result = tmpResult;
        return result;
    }
}
