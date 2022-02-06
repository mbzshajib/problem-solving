package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/6/2022 at 12:10 AM.
 */
public class RemoveDuplicateLetters_Solution_Test {
    @Test
    void testAll(){
        Assertions.assertEquals("abc",new RemoveDuplicateLetters_Solution().removeDuplicateLetters("bcabc"));
        Assertions.assertEquals("acdb",new RemoveDuplicateLetters_Solution().removeDuplicateLetters("cbacdcbc"));
    }

    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }

    @Test
    void test(){
        thirdMax(new int[]{1,1,2});
        thirdMax(new int[]{3,1});
    }
}
