package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 1:26 PM.
 */
public class BinaryTreePostorderTraversal_Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        if (root.left != null) result.addAll(postorderTraversal(root.left));
        if (root.right != null) result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

}
