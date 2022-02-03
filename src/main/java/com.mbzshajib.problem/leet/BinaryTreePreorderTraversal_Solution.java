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
public class BinaryTreePreorderTraversal_Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        result.add(root.val);
        if (root.left != null) result.addAll(preorderTraversal(root.left));
        if (root.right != null) result.addAll(preorderTraversal(root.right));
        return result;
    }

}
