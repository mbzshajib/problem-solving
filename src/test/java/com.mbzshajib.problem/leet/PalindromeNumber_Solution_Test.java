package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:46 PM.
 */

public class PalindromeNumber_Solution_Test {
    @Test
    void allTest() {
        Assertions.assertTrue(new PalindromeNumber_Solution().isPalindrome(121));
        Assertions.assertTrue(new PalindromeNumber_Solution().isPalindrome(0));
        Assertions.assertTrue(new PalindromeNumber_Solution().isPalindrome(1));
        Assertions.assertTrue(new PalindromeNumber_Solution().isPalindrome(44));

        Assertions.assertFalse(new PalindromeNumber_Solution().isPalindrome(Integer.MAX_VALUE));
        Assertions.assertFalse(new PalindromeNumber_Solution().isPalindrome(110));
        Assertions.assertFalse(new PalindromeNumber_Solution().isPalindrome(1231));
        Assertions.assertFalse(new PalindromeNumber_Solution().isPalindrome(10));
    }
}
