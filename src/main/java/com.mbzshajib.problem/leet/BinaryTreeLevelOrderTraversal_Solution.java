package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 1:25 PM.
 */
public class BinaryTreeLevelOrderTraversal_Solution {
    class NodeLevelPair {
        TreeNode node;
        Integer level;

        public NodeLevelPair(TreeNode node, Integer pair) {
            this.node = node;
            this.level = pair;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        Stack<NodeLevelPair> stack = new Stack<>();
        stack.push(new NodeLevelPair(root, 1));
        while (!stack.empty()) {
            NodeLevelPair curr = stack.pop();
            TreeNode currNode = curr.node;
            Integer currVal = curr.node.val;
            Integer currLevel = curr.level;
            List<Integer> listOfNodes = new ArrayList<>();
            if (currLevel > result.size()) {
                listOfNodes.add(currVal);
                result.add(currLevel - 1, listOfNodes);
            } else {
                listOfNodes = result.get(currLevel - 1);
                listOfNodes.add(currVal);
            }
            if (currNode.right != null) stack.push(new NodeLevelPair(currNode.right, currLevel + 1));
            if (currNode.left != null) stack.push(new NodeLevelPair(currNode.left, currLevel + 1));

        }


        return result;
    }
}
