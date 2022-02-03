package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 2:15 PM.
 */
public class PathSum_Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean result = false;
        if (root == null) return false;
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            System.out.println("target sum " + targetSum);
            return true;
        }
        if (!result&&root.left != null) result = hasPathSum(root.left, targetSum - root.val);
        if (!result&&root.right != null) result=hasPathSum(root.right, targetSum - root.val);

        return result;
    }
}
