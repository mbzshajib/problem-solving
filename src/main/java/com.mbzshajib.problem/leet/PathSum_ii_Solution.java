package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:37 AM.
 */
public class PathSum_ii_Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        if (root == null) return result;
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(Arrays.asList(root.val));
            return result;
        }
        dfs(root, result, data, targetSum);
        return result;
    }

    private void dfs(TreeNode node, List<List<Integer>> result, List<Integer> data, int targetSum) {
        if (node == null) return;
        targetSum = targetSum - node.val;
        data.add(node.val);
        if (node.left == null && node.right == null && targetSum == 0) {
            result.add(data);
            return;
        }
        dfs(node.left, result, new ArrayList<>(data), targetSum);
        dfs(node.right, result, new ArrayList<>(data), targetSum);

    }
}
