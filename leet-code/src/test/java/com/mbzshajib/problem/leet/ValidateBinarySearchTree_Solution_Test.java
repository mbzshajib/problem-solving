package com.mbzshajib.problem.leet;

import jdk.jshell.execution.Util;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:08 PM.
 */
@Suite
public class ValidateBinarySearchTree_Solution_Test {
    @Test
    void allTest() {
        Assert.assertTrue(new ValidateBinarySearchTree_Solution().isValidBST(Utils.prepareTree(new Integer[]{2, 1, 3})));
        Assert.assertFalse(new ValidateBinarySearchTree_Solution().isValidBST(Utils.prepareTree(new Integer[]{1, 2, 3, 4, 5, 6, 7})));
        Assert.assertFalse(new ValidateBinarySearchTree_Solution().isValidBST(Utils.prepareTree(new Integer[]{5, 1, 4, null, null, 3, 6})));
        Assert.assertFalse(new ValidateBinarySearchTree_Solution().isValidBST(Utils.prepareTree(new Integer[]{5, 4, 6, null, null, 3, 7})));
        List<Integer>result = new ArrayList<>();
        Utils.traverseInOrder(Utils.prepareTree(new Integer[]{5, 4, 6, null, null, 3, 7}),result);
        System.out.println(result);


    }
}
