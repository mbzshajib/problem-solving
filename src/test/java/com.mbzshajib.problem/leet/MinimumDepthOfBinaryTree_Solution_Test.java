package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 11:22 AM.
 */

public class MinimumDepthOfBinaryTree_Solution_Test {
    @Test
    void allTest() {
        Assertions.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
        Assertions.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{1, 2, 7, 3, null, null, null, 4, null})));
        Assertions.assertEquals(5, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{2, null, 3, null, 4, null, 5, null, 6})));
        Assertions.assertEquals(2, new MinimumDepthOfBinaryTree_Solution().minDepth(Utils.prepareTree(new Integer[]{1,2})));
    }
}
