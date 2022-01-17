package com.mbzshajib.problem.leet;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            if (data[counter] != null) {
                node.right = new TreeNode(data[counter]);
                queue.add(node.right);
            }
            counter++;
        }
        return root;
    }

    public static void traversePreOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        traversePreOrder(node.left, result);
        traversePreOrder(node.right, result);
    }

    public static void traverseInOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        traverseInOrder(node.left, result);
        result.add(node.val);
        traverseInOrder(node.right, result);
    }

    public static void traversePostOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        traversePostOrder(node.left, result);
        traversePostOrder(node.right, result);
        result.add(node.val);
    }

    public static ListNode prepareLinkList(Integer[] data) {
        if (data == null) return null;
        if (data.length == 0) return null;
        ListNode root = new ListNode(data[0]);
        AtomicReference<ListNode> node = new AtomicReference<>();
        node.set(root);
        IntStream.range(1, data.length)
                .mapToObj(index -> {
                    ListNode tmp = new ListNode(data[index]);
                    node.get().next = tmp;
                    node.set(tmp);
                    return tmp;
                })
                .collect(Collectors.toList());
        return root;
    }
}
