package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/30/2022 at 7:10 PM.
 */

public class SumOfTwoIntegers_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(10, new SumOfTwoIntegers_Solution().getSum(5, 5));
        Assertions.assertEquals(10, new SumOfTwoIntegers_Solution().getSum(3, 7));
        Assertions.assertEquals(39, new SumOfTwoIntegers_Solution().getSum(32, 7));
        Assertions.assertEquals(39, new SumOfTwoIntegers_Solution().getSum(7, 32));
        Assertions.assertEquals(327, new SumOfTwoIntegers_Solution().getSum(7, 320));
        Assertions.assertEquals(7, new SumOfTwoIntegers_Solution().getSum(7, 0));
        Assertions.assertEquals(-2, new SumOfTwoIntegers_Solution().getSum(-1, -1));
        Assertions.assertEquals(0, new SumOfTwoIntegers_Solution().getSum(-1, 1));
        Assertions.assertEquals(-99, new SumOfTwoIntegers_Solution().getSum(-100, 1));
        Assertions.assertEquals(-110, new SumOfTwoIntegers_Solution().getSum(-100, -10));
    }

}
