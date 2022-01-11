package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 10:57 AM.
 */
public class InsertIntoABinarySearchTree_Solution {
    public TreeNode insertIntoBST(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);
        if (val < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
                return node;
            } else {
                insertIntoBST(node.left, val);
            }
        }
        if (val > node.val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
                return node;
            } else {
                insertIntoBST(node.right, val);
            }
        }
        return node;

    }
}
