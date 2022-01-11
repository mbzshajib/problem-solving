package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 11:22 AM.
 */
@Suite
public class MinimumDepthOfBinaryTree_Solution_Test {
    @Test
    void allTest() {
        Assert.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
        Assert.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{1, 2, 7, 3, null, null, null, 4, null})));
        Assert.assertEquals(5, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{2, null, 3, null, 4, null, 5, null, 6})));
        Assert.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{1,2})));
    }
}
