package com.mbzshajib.problem.leet;

import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:46 PM.
 */
public class MinimumDeletionsToMakeStringBalanced_Solution {
    public int minimumDeletions(String s) {
        int b = 0, result = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b') b++;
            else result++;
            result = Math.min(result, b);
        }
        return result;
    }
}
