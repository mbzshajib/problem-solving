package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:53 PM.
 */
@Suite
public class ANumberAfterADoubleReversal_Solution_Test {
    @Test
    void allTest() {
        Assert.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(526));
        Assert.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(0));
        Assert.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(0x000B));

        Assert.assertFalse(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(1800));



    }
}
