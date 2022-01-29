package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:28 PM.
 */
public class MaximumSubarray_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(6, new MaximumSubarray_Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assertions.assertEquals(1, new MaximumSubarray_Solution().maxSubArray(new int[]{1}));
        Assertions.assertEquals(23, new MaximumSubarray_Solution().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
