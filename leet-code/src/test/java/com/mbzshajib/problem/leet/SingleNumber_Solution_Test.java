package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:22 PM.
 */
@Suite
public class SingleNumber_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(1, new SingleNumber_Solution().singleNumber(new int[]{1}));
        Assert.assertEquals(1, new SingleNumber_Solution().singleNumber(new int[]{2, 2, 1}));
        Assert.assertEquals(4, new SingleNumber_Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
        Assert.assertEquals(5, new SingleNumber_Solution().singleNumber(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5}));
        Assert.assertEquals(5, new SingleNumber_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4}));
    }
}
