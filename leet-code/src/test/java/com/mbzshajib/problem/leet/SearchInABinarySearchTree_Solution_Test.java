package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

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
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }

    @Test
    void testcase_Provided_02() {
        TreeNode result = new SearchInABinarySearchTree_Solution().searchBST(Utils.prepareTree(new Integer[]{4, 2, 7, 1, 3}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{});
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }

    @Test
    void testcase_Provided_03() {
        TreeNode result = new SearchInABinarySearchTree_Solution().searchBST(Utils.prepareTree(new Integer[]{4, 2, 7, 1, 3}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{});
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }


}
