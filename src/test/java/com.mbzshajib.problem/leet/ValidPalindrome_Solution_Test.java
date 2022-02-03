package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 11:31 AM.
 */
public class ValidPalindrome_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new ValidPalindrome_Solution().isPalindrome("aba aba"));
        Assertions.assertTrue(new ValidPalindrome_Solution().isPalindrome("aba"));
        Assertions.assertTrue(new ValidPalindrome_Solution().isPalindrome(""));
        Assertions.assertTrue(new ValidPalindrome_Solution().isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertFalse(new ValidPalindrome_Solution().isPalindrome("race a car"));
        Assertions.assertFalse(new ValidPalindrome_Solution().isPalindrome("abc abc"));
    }
}
