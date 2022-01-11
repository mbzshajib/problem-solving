package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 1:22 AM.
 */
public class SearchInABinarySearchTree_Solution {
    public TreeNode searchBST(TreeNode node, int val) {
        if (node == null) return null;
        if (node.val == val) return node;
        TreeNode tmp = null;
        if (node.val > val) {
            if (node.left != null) {
                tmp = searchBST(node.left, val);
            }
        } else {
            if (node.right != null) {
                tmp = searchBST(node.right, val);
            }
        }
        return tmp;
    }
}
