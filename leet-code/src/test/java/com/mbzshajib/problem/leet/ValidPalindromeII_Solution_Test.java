package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 11:44 AM.
 */
@Suite
public class ValidPalindromeII_Solution_Test {
    @Test
    void testAll(){
        Assertions.assertTrue(new ValidPalindromeII_Solution().validPalindrome("aba"));
        Assertions.assertTrue(new ValidPalindromeII_Solution().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        Assertions.assertTrue(new ValidPalindromeII_Solution().validPalindrome("abca"));
        Assertions.assertFalse(new ValidPalindromeII_Solution().validPalindrome("abc"));
    }
}
