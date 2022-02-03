package com.mbzshajib.problem.leet;

import jdk.jshell.execution.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 12:19 PM.
 */
@Suite
public class MaximumLevelSumOfABinaryTree_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(2, new MaximumLevelSumOfABinaryTree_Solution().maxLevelSum(Utils.prepareTree(new Integer[]{1, 7, 0, 7, -8, null, null})));
        Assertions.assertEquals(2, new MaximumLevelSumOfABinaryTree_Solution().maxLevelSum(Utils.prepareTree(new Integer[]{989, null, 10250, 98693, -89388, null, null, null, -32127})));
        Assertions.assertEquals(3, new MaximumLevelSumOfABinaryTree_Solution().maxLevelSum(Utils.prepareTree(new Integer[]{-100, -200, -300, -20, -5, -10, null})));
        Assertions.assertEquals(1, new MaximumLevelSumOfABinaryTree_Solution().maxLevelSum(Utils.prepareTree(new Integer[]{1, 1, 0, 7, -8, -7, 9})));
    }

}
