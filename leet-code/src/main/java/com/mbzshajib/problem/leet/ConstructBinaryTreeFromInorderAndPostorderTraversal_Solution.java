package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 2:39 AM.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal_Solution {
    private int index;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] postorder, int left, int right) {
        if (left > right) return null;
        int rootVal = postorder[index--];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);
        root.right = buildTree(postorder, rootIndex + 1, right);
        root.left = buildTree(postorder, left, rootIndex - 1);
        return root;
    }
}
