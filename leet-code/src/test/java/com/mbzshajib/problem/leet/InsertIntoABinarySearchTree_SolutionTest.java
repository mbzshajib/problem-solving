package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 10:57 AM.
 */
@Suite
public class InsertIntoABinarySearchTree_SolutionTest {
    @Test
    void testcase_Provided_01() {
        TreeNode result = new InsertIntoABinarySearchTree_Solution().insertIntoBST(Utils.prepareTree(new Integer[]{4,2,7,1,3}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{4,2,7,1,3,5});
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }

    @Test
    void testcase_Provided_02() {
        TreeNode result = new InsertIntoABinarySearchTree_Solution().insertIntoBST(Utils.prepareTree(new Integer[]{40,20,60,10,30,50,70}), 25);
        TreeNode expected = Utils.prepareTree(new Integer[]{40,20,60,10,30,50,70,null,null,25});
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }

    @Test
    void testcase_Provided_03() {
        TreeNode result = new InsertIntoABinarySearchTree_Solution().insertIntoBST(Utils.prepareTree(new Integer[]{4,2,7,1,3,null,null,null,null,null,null}), 5);
        TreeNode expected = Utils.prepareTree(new Integer[]{4,2,7,1,3,5});
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(expected, result);
    }
}
