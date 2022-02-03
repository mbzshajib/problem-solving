package com.mbzshajib.problem.leet;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:42 PM.
 */
public class ReverseLinkedListII_Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;
        int index = 1;
        ListNode node = head;
        ListNode parent = null;
        ListNode start = null, end = null;

        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (index < left) {
                start = node;

            }
            if (index > right) break;
            if (left <= index && index <= right) {
                stack.push(node.val);
                end = node;
            }
            node = node.next;
            index++;
        }

        while (!stack.empty()) {
            if (start == null) {
                start = new ListNode(stack.pop());
                head = start;
                continue;
            }
            start.next = new ListNode(stack.pop());
            start = start.next;
        }
        start.next = end.next;

        return head;
    }
}
