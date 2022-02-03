package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:18 AM.
 */
public class SumRootToLeafNumbers_Solution {
    public int sumNumbers(TreeNode root) {
        int result = 0;
        if (root == null) return result;
        if (root.left == null && root.right == null) return root.val;
        String data = String.valueOf(root.val);
        List<String> list = new ArrayList<>();
        if (root.left != null) dfs(root.left, list, data);
        if (root.right != null) dfs(root.right, list, data);
        result = list.stream()
                .mapToInt(string -> Integer.valueOf(string))
                .sum();
        return result;
    }

    void dfs(TreeNode node, List<String> result, String data) {
        if (node == null) return;
        data = data + node.val;
        if (node.left == null && node.right == null) {
            result.add(data);
            return;
        }
        if (node.left != null) dfs(node.left, result, data);
        if (node.right != null) dfs(node.right, result, data);
    }
}
