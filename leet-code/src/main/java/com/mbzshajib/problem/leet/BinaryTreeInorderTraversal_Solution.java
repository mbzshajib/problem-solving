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
public class BinaryTreeInorderTraversal_Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        if (root.left != null) result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        if (root.right != null) result.addAll(inorderTraversal(root.right));
        return result;
    }

}
