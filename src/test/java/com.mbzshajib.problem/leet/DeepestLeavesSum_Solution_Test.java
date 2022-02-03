package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 11:23 AM.
 */

public class DeepestLeavesSum_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(15, new DeepestLeavesSum_Solution().deepestLeavesSum(Utils.prepareTree(new Integer[]{1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8})));
        Assertions.assertEquals(19, new DeepestLeavesSum_Solution().deepestLeavesSum(Utils.prepareTree(new Integer[]{6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5})));
    }

}
