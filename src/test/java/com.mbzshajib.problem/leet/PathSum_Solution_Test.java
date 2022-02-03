package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 2:16 PM.
 */

public class PathSum_Solution_Test {
    @Test
    void allCases() {
        boolean b = new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 22);
        Assertions.assertTrue(true);
        Assertions.assertTrue(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 4));
        Assertions.assertTrue(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 3));

        Assertions.assertFalse(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 5));
        Assertions.assertFalse(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{}), 0));


    }
}
