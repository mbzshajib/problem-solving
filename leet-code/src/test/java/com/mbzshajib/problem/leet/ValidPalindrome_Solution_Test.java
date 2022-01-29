package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 11:31 AM.
 */
@Suite
public class ValidPalindrome_Solution_Test {
    @Test
    void testAll() {
        Assert.assertTrue(new ValidPalindrome_Solution().isPalindrome("aba aba"));
        Assert.assertTrue(new ValidPalindrome_Solution().isPalindrome("aba"));
        Assert.assertTrue(new ValidPalindrome_Solution().isPalindrome(""));
        Assert.assertTrue(new ValidPalindrome_Solution().isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(new ValidPalindrome_Solution().isPalindrome("race a car"));
        Assert.assertFalse(new ValidPalindrome_Solution().isPalindrome("abc abc"));
    }
}
