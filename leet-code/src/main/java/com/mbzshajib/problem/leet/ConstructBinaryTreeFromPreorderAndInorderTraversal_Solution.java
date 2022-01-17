package com.mbzshajib.problem.leet;

import jdk.jshell.Snippet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 2:10 AM.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_Solution {
    private int index = 0;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);

        root.left = buildTree(preorder, start, map.get(rootVal) - 1);
        root.right = buildTree(preorder, map.get(rootVal) + 1, end);
        return root;
    }
}
