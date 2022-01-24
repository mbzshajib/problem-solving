package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:40 PM.
 */
@Suite
public class CheckIfAllAsAppearsBeforeAllBs_Solution_Test {
    @Test
    void testAll() {
        Assert.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString(""));
        Assert.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("aaabbb"));
        Assert.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("bbb"));

        Assert.assertFalse(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("abab"));
        Assert.assertFalse(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("aaba"));
    }
}
