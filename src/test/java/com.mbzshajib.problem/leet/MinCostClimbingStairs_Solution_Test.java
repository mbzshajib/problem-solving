package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 5:14 PM.
 */

public class MinCostClimbingStairs_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(15, new MinCostClimbingStairs_Solution().minCostClimbingStairs(new int[]{10, 15, 20}));
        Assertions.assertEquals(6,  new MinCostClimbingStairs_Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
