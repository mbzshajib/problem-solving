package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 6:44 PM.
 */
public class CheckIfArrayIsSortedAndRotated_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{3, 4, 5, 1, 2}));
        Assertions.assertFalse(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{2,1,3,4}));
        Assertions.assertTrue(new CheckIfArrayIsSortedAndRotated_Solution().check(new int[]{1,2,3}));
    }
}
