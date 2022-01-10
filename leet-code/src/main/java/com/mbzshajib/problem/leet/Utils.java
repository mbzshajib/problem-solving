package com.mbzshajib.problem.leet;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 11:31 AM.
 */
public class Utils {
    public static final TreeNode prepareTree(Integer[] data) {
        if (data == null || data.length == 0 || data[0] == null) return null;
        TreeNode root = new TreeNode(data[0]);
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        int counter = 1;
        while (counter < data.length) {
            TreeNode node = queue.poll();
            if (node == null) return root;
            if (data[counter] != null) {
                node.left = new TreeNode(data[counter]);
                queue.add(node.left);
            }
            counter++;
            if (counter >= data.length) break;
            if (data[counter ] != null) {
                node.right = new TreeNode(data[counter]);
                queue.add(node.right);
            }
            counter++;
        }
        return root;
    }
}
