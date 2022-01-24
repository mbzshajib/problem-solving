package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 6:44 PM.
 */
@Suite
public class CheckIfArrayIsSortedAndRotated_Solution_Test {
    @Test
    void testAll() {
        Assert.assertTrue(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{3, 4, 5, 1, 2}));
        Assert.assertFalse(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{2,1,3,4}));
        Assert.assertTrue(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{1,2,3}));
    }
}
