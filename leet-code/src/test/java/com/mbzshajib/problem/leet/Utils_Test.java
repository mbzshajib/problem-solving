package com.mbzshajib.problem.leet;


import com.sun.source.tree.Tree;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 11:42 AM.
 */
@Suite
public class Utils_Test {
    @Test
    void prepareTree_Test_001_NullChecking() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{});
        Assert.assertNull(treeNode);
    }
    @Test
    void prepareTree_Test_001_NullChecking_V2() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{null});
        Assert.assertNull(treeNode);
    }
    @Test
    void prepareTree_Test_001_NullChecking_V3() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{null,null});
        Assert.assertNull(treeNode);
    }
    @Test
    void prepareTree_Test_001_NullChecking_V4() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, null, null, 3, 4, 5, 6});
        Assert.assertEquals(treeNode.val,0);
        Assert.assertNull(treeNode.left);
        Assert.assertNull(treeNode.right);
    }

    @Test
    void prepareTree_Test_001_BalancedTree() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5, 6});
        Assert.assertEquals(treeNode.val, 0);
        Assert.assertEquals(treeNode.left.val, 1);
        Assert.assertEquals(treeNode.right.val, 2);
        Assert.assertEquals(treeNode.left.left.val, 3);
        Assert.assertEquals(treeNode.left.right.val, 4);
        Assert.assertEquals(treeNode.right.left.val, 5);
        Assert.assertEquals(treeNode.right.right.val, 6);
    }
    @Test
    void prepareTree_Test_001_NullRightRight() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5});
        Assert.assertEquals(treeNode.val, 0);
        Assert.assertEquals(treeNode.left.val, 1);
        Assert.assertEquals(treeNode.right.val, 2);
        Assert.assertEquals(treeNode.left.left.val, 3);
        Assert.assertEquals(treeNode.left.right.val, 4);
        Assert.assertEquals(treeNode.right.left.val, 5);
        Assert.assertEquals(treeNode.right.right, null);
    }
    @Test
    void prepareTree_Test_001_NullRightRight_V2() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5,null});
        Assert.assertEquals(treeNode.val, 0);
        Assert.assertEquals(treeNode.left.val, 1);
        Assert.assertEquals(treeNode.right.val, 2);
        Assert.assertEquals(treeNode.left.left.val, 3);
        Assert.assertEquals(treeNode.left.right.val, 4);
        Assert.assertEquals(treeNode.right.left.val, 5);
        Assert.assertEquals(treeNode.right.right, null);
    }
    @Test
    void prepareTree_Test_001_NullRightRight_V3() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, null,5});
        Assert.assertEquals(treeNode.val, 0);
        Assert.assertEquals(treeNode.left.val, 1);
        Assert.assertEquals(treeNode.right.val, 2);
        Assert.assertEquals(treeNode.left.left.val, 3);
        Assert.assertEquals(treeNode.left.right.val, 4);
        Assert.assertEquals(treeNode.right.left, null);
        Assert.assertEquals(treeNode.right.right.val, 5);
    }
    @Test
    void prepareTree_Test_001_NullRightRight_V5() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, null,3, 4,5});
        Assert.assertEquals(treeNode.val, 0);
        Assert.assertEquals(treeNode.left.val, 1);
        Assert.assertEquals(treeNode.right.val, 2);
        Assert.assertEquals(treeNode.left.left, null);
        Assert.assertEquals(treeNode.left.right.val, 3);
        Assert.assertEquals(treeNode.right.left.val, 4);
        Assert.assertEquals(treeNode.right.right.val, 5);
    }
}
