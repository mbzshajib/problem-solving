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
public class MaximumDepthOfBinaryTree_Solution_Test {
    @Test
    void allTest() {
        Assert.assertEquals(3, new MaximumDepthOfBinaryTree_Solution().maxDepth(Utils.prepareTree(new Integer[]{3,9,20,null,null,15,7})));
        Assert.assertEquals(2, new MaximumDepthOfBinaryTree_Solution().maxDepth(Utils.prepareTree(new Integer[]{1,null,2})));
    }
}
