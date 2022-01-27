package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 5:27 PM.
 */
@Suite
public class HouseRobber_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(4, new HouseRobber_Solution().rob(new int[]{1, 2, 3, 1}));
        Assertions.assertEquals(12, new HouseRobber_Solution().rob(new int[]{2,7,9,3,1}));
    }
}
