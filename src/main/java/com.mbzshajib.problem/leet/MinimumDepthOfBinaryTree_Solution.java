package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 11:22 AM.
 */
public class MinimumDepthOfBinaryTree_Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return minDepth(root.right)+1;
        if (root.left == null && root.right != null) return minDepth(root.right) + 1;
        if (root.left != null && root.right == null) return minDepth(root.left) + 1;
        else return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }

}
