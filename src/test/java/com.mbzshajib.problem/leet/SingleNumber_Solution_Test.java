package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:22 PM.
 */

public class SingleNumber_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(1, new SingleNumber_Solution().singleNumber(new int[]{1}));
        Assertions.assertEquals(1, new SingleNumber_Solution().singleNumber(new int[]{2, 2, 1}));
        Assertions.assertEquals(4, new SingleNumber_Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
        Assertions.assertEquals(5, new SingleNumber_Solution().singleNumber(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5}));
        Assertions.assertEquals(5, new SingleNumber_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4}));
    }
}
