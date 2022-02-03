package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 1:19 PM.
 */
public class SameTree_Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        boolean isSameRight = isSameTree(q.right, q.right);
        boolean isSameLeft = isSameTree(p.left, q.left);

        boolean result = isSameTree(p.left, q.left) ;
        result = result && isSameTree(p.right, q.right);
        return result;
    }
}
