package com.mbzshajib.problem.leet;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Random;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 11:42 AM.
 */
public class Utils_Test {
    @Test
    void prepareTree_Test_001_NullChecking() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{});
        Assertions.assertNull(treeNode);
    }

    @Test
    void prepareTree_Test_001_NullChecking_V2() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{null});
        Assertions.assertNull(treeNode);
    }

    @Test
    void prepareTree_Test_001_NullChecking_V3() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{null, null});
        Assertions.assertNull(treeNode);
    }

    @Test
    void prepareTree_Test_001_NullChecking_V4() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, null, null, 3, 4, 5, 6});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertNull(treeNode.left);
        Assertions.assertNull(treeNode.right);
    }

    @Test
    void prepareTree_Test_001_BalancedTree() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5, 6});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertEquals(treeNode.left.val, 1);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertEquals(treeNode.left.left.val, 3);
        Assertions.assertEquals(treeNode.left.right.val, 4);
        Assertions.assertEquals(treeNode.right.left.val, 5);
        Assertions.assertEquals(treeNode.right.right.val, 6);
    }

    @Test
    void prepareTree_Test_001_NullRightRight() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertEquals(treeNode.left.val, 1);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertEquals(treeNode.left.left.val, 3);
        Assertions.assertEquals(treeNode.left.right.val, 4);
        Assertions.assertEquals(treeNode.right.left.val, 5);
        Assertions.assertEquals(treeNode.right.right, null);
    }

    @Test
    void prepareTree_Test_001_NullRightRight_V2() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, 5, null});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertEquals(treeNode.left.val, 1);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertEquals(treeNode.left.left.val, 3);
        Assertions.assertEquals(treeNode.left.right.val, 4);
        Assertions.assertEquals(treeNode.right.left.val, 5);
        Assertions.assertEquals(treeNode.right.right, null);
    }

    @Test
    void prepareTree_Test_001_NullRightRight_V3() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, 3, 4, null, 5});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertEquals(treeNode.left.val, 1);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertEquals(treeNode.left.left.val, 3);
        Assertions.assertEquals(treeNode.left.right.val, 4);
        Assertions.assertEquals(treeNode.right.left, null);
        Assertions.assertEquals(treeNode.right.right.val, 5);
    }

    @Test
    void prepareTree_Test_001_NullRightRight_V5() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{0, 1, 2, null, 3, 4, 5});
        Assertions.assertEquals(treeNode.val, 0);
        Assertions.assertEquals(treeNode.left.val, 1);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertEquals(treeNode.left.left, null);
        Assertions.assertEquals(treeNode.left.right.val, 3);
        Assertions.assertEquals(treeNode.right.left.val, 4);
        Assertions.assertEquals(treeNode.right.right.val, 5);
    }

    @Test
    void prepareTree_Test_001_NullRightRight_V6() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{1, null, 2, 3});
        Assertions.assertEquals(treeNode.val, 1);
        Assertions.assertNull(treeNode.left);
        Assertions.assertEquals(treeNode.right.val, 2);
        Assertions.assertNotNull(treeNode.right.left);
        Assertions.assertEquals(treeNode.right.left.val, 3);
        Assertions.assertNull(treeNode.right.right);
    }

    @Test
    void testLinkedList() {
        ListNode node = Utils.prepareLinkList(null);
        Assertions.assertNull(node);
        node = Utils.prepareLinkList(new Integer[]{});
        Assertions.assertNull(node);
        Integer[] data = {5, 245, 5, 2};
        node = Utils.prepareLinkList(data);
        Assertions.assertNotNull(node);
        Assertions.assertEquals(node.val, 5);
        Assertions.assertEquals(node.next.val, 245);
        Assertions.assertEquals(node.next.next.val, 5);
        Assertions.assertEquals(node.next.next.next.val, 2);
        int count = 0;
        ListNode tmp = node;
        Integer[] result = data;
        while (tmp != null) {
            result[count] = tmp.val;
            tmp = tmp.next;
            count++;
        }
        Assertions.assertEquals(data.length, count);
        Assertions.assertArrayEquals(data, result);
    }

    String generateRandom() {
        return Long.toHexString(0x100000L+new Random().nextLong()%0x7FFFFFL);
    }

    @Test
    void testGenerateRandom() {
        System.out.println(generateRandom());
    }
}
