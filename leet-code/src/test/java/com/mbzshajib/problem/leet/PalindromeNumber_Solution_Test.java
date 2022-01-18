package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:46 PM.
 */
@Suite
public class PalindromeNumber_Solution_Test {
    @Test
    void allTest() {
        Assert.assertTrue(new PalindromeNumber_Solution().isPalindrome(121));
        Assert.assertTrue(new PalindromeNumber_Solution().isPalindrome(0));
        Assert.assertTrue(new PalindromeNumber_Solution().isPalindrome(1));
        Assert.assertTrue(new PalindromeNumber_Solution().isPalindrome(44));

        Assert.assertFalse(new PalindromeNumber_Solution().isPalindrome(Integer.MAX_VALUE));
        Assert.assertFalse(new PalindromeNumber_Solution().isPalindrome(110));
        Assert.assertFalse(new PalindromeNumber_Solution().isPalindrome(1231));
        Assert.assertFalse(new PalindromeNumber_Solution().isPalindrome(10));
    }
}
