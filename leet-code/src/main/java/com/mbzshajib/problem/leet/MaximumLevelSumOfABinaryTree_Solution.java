package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 12:20 PM.
 */
public class MaximumLevelSumOfABinaryTree_Solution {
    class NodeLevelPair {
        private TreeNode node;
        private Integer level;

        public NodeLevelPair(TreeNode node, Integer level) {
            this.node = node;
            this.level = level;
        }
    }

    public int maxLevelSum(TreeNode root) {

        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        Map<Integer, Integer> levelSumMapper = new HashMap<>();
        Stack<NodeLevelPair> stack = new Stack<>();
        stack.push(new NodeLevelPair(root, 1));

        while (!stack.empty()) {
            NodeLevelPair curr = stack.pop();
            TreeNode currNode = curr.node;
            Integer currLevel = curr.level;
            Integer levelSum = levelSumMapper.getOrDefault(currLevel, 0);
            levelSum = levelSum + currNode.val;
            levelSumMapper.put(currLevel, levelSum);
            if (currNode.left != null) stack.push(new NodeLevelPair(currNode.left, currLevel + 1));
            if (currNode.right != null) stack.push(new NodeLevelPair(currNode.right, currLevel + 1));
        }
        int minLevel = 1;
        int sum = Integer.MIN_VALUE;
        for (int i = 1; i <= levelSumMapper.size(); i++) {
            if (sum < levelSumMapper.get(i)) {
                sum = levelSumMapper.get(i);
                minLevel = i;
            }
        }

        return minLevel;
    }
}
