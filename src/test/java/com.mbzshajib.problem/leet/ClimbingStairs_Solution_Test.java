package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 4:22 PM.
 */
public class ClimbingStairs_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(1, new ClimbingStairs_Solution().climbStairs(1));
        Assertions.assertEquals(2,new ClimbingStairs_Solution().climbStairs(2));
        Assertions.assertEquals(3,new ClimbingStairs_Solution().climbStairs(3));
        Assertions.assertEquals(1836311903,new ClimbingStairs_Solution().climbStairs(45));

    }
}
