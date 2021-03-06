package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:38 PM.
 */

public class SingleNumberIII_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(
                Arrays.equals(new int[]{5, 3}, new SingleNumberIII_Solution().singleNumber(new int[]{1, 2, 1, 3, 2, 5})) ||
                        Arrays.equals(new int[]{3, 5}, new SingleNumberIII_Solution().singleNumber(new int[]{1, 2, 1, 3, 2, 5}))
        );

        Assertions.assertTrue(
                Arrays.equals(new int[]{-1, 0}, new SingleNumberIII_Solution().singleNumber(new int[]{-1, 0})) ||
                        Arrays.equals(new int[]{0, -1}, new SingleNumberIII_Solution().singleNumber(new int[]{-1, 0}))
        );
        Assertions.assertTrue(
                Arrays.equals(new int[]{0, 1}, new SingleNumberIII_Solution().singleNumber(new int[]{0, 1})) ||
                        Arrays.equals(new int[]{1, 0}, new SingleNumberIII_Solution().singleNumber(new int[]{0, 1}))
        );
    }
}
