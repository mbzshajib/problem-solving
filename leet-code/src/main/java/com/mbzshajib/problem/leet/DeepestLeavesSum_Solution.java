package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 11:22 AM.
 */
public class DeepestLeavesSum_Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Map<TreeNode, Integer> levelMapper = new HashMap<>();
        levelMapper.put(root, 1);
        int maxLevel = 0;

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            Integer currLevel = levelMapper.get(currNode);

            if (currNode.left != null) {
                queue.add(currNode.left);
                levelMapper.put(currNode.left, currLevel + 1);
                maxLevel = Math.max(maxLevel, currLevel + 1);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
                levelMapper.put(currNode.right, currLevel + 1);
                maxLevel = Math.max(maxLevel, currLevel + 1);
            }

        }
        System.out.println(levelMapper.size());
        Iterator<Map.Entry<TreeNode, Integer>> lavelMapperIterator = levelMapper.entrySet().iterator();
        int result = 0;
        while (lavelMapperIterator.hasNext()) {
            Map.Entry<TreeNode, Integer> entry = lavelMapperIterator.next();
            if (entry.getValue() == maxLevel) result = result + entry.getKey().val;
        }
        return result;
    }
}
