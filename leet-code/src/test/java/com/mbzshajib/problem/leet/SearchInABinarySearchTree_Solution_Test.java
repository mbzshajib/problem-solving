package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 1:22 AM.
 */
@Suite
public class SearchInABinarySearchTree_Solution_Test {
    @Test
    void testcase_Provided_01() {
        TreeNode result = new SearchInABinarySearchTree_Solution().searchBST(Utils.prepareTree(new Integer[]{4, 2, 7, 1, 3}), 2);
        TreeNode expected = Utils.prepareTree(new Integer[]{2, 1, 3});
        validate(expected, result);
    }
    @Test
    void testcase_Provided_02() {
        TreeNode result = new SearchInABinarySearchTree_Solution().searchBST(Utils.prepareTree(new Integer[]{4,2,7,1,3}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{});
        validate(expected, result);
    }
    @Test
    void testcase_Provided_03() {
        TreeNode result = new SearchInABinarySearchTree_Solution().searchBST(Utils.prepareTree(new Integer[]{4,2,7,1,3}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{});
        validate(expected, result);
    }

    private void validate(TreeNode expected, TreeNode result) {
        ArrayList<Integer> expectedList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        Utils.traversePreOrder(expected, expectedList);
        Utils.traversePreOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        expectedList = new ArrayList<>();
        resultList = new ArrayList<>();
        Utils.traverseInOrder(expected, expectedList);
        Utils.traverseInOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        expectedList = new ArrayList<>();
        resultList = new ArrayList<>();
        Utils.traversePostOrder(expected, expectedList);
        Utils.traversePostOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());
    }
}
