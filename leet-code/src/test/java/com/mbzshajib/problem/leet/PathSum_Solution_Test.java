package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 2:16 PM.
 */
@Suite
public class PathSum_Solution_Test {
    @Test
    void allCases() {
        boolean b = new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 22);
        Assert.assertTrue(true);
        Assert.assertTrue(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 4));
        Assert.assertTrue(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 3));

        Assert.assertFalse(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 5));
        Assert.assertFalse(new PathSum_Solution().hasPathSum(Utils.prepareTree(new Integer[]{}), 0));


    }
}
