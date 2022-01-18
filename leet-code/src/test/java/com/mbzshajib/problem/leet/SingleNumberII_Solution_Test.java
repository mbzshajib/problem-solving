package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:29 PM.
 */
@Suite
public class SingleNumberII_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(3, new SingleNumberII_Solution().singleNumber(new int[]{2, 2, 3, 2}));
        Assert.assertEquals(99, new SingleNumberII_Solution().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));

        Assert.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        Assert.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
        Assert.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
    }
}
