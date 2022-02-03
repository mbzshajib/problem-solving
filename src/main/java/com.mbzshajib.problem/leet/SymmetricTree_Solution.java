package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:54 PM.
 */
public class SymmetricTree_Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        if (root.left == null || root.right == null || root.left.val != root.right.val) return false;
        return isSymmetric(root.left, root.right);
    }

    boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left != null && right == null) || (left == null && right != null) || left.val != right.val) return false;
        boolean isLeft = isSymmetric(left.left, right.right);
        boolean isRight = isSymmetric(left.right, right.left);
        return isLeft && isRight;
    }
}
