package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 3:35 PM.
 */
public class BinaryTreePaths_Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        String data = String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            result.add(data);
            return result;
        }
        findPaths(root.left, result, data);
        findPaths(root.right, result, data);
        return result;
    }

    private void findPaths(TreeNode node, List<String> result, String data) {
        if (node == null) return;
        data = data + "->" + node.val;
        if (node.left == null && node.right == null) {
            System.out.println("Leaf node found: " + node.val);
            result.add(data);
            return;
        }
        if (node.left != null) {
            findPaths(node.left, result, data);
        }
        if (node.right != null) {
            findPaths(node.right, result, data);
        }
        return;
    }
}
