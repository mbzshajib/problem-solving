package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:29 PM.
 */

public class SingleNumberII_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(3, new SingleNumberII_Solution().singleNumber(new int[]{2, 2, 3, 2}));
        Assertions.assertEquals(99, new SingleNumberII_Solution().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));

        Assertions.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        Assertions.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
        Assertions.assertEquals(6, new SingleNumberII_Solution().singleNumber(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
    }
}
