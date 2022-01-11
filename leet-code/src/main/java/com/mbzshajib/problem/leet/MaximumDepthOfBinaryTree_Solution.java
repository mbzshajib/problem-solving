package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 11:22 AM.
 */
public class MaximumDepthOfBinaryTree_Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return maxDepth(root.right)+1;
        if (root.left == null && root.right != null) return maxDepth(root.right) + 1;
        if (root.left != null && root.right == null) return maxDepth(root.left) + 1;
        else return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

}
