package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:08 PM.
 */
public class ValidateBinarySearchTree_Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode left = null, right = null;
        return isValid(root, left, right);
    }

    public boolean isValid(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null) return true;
        if (left != null && left.val >= root.val)
            return false;
        if (right != null && right.val <= root.val)
            return false;
        return isValid(root.left, left, root) && isValid(root.right, root, right);
    }
}
