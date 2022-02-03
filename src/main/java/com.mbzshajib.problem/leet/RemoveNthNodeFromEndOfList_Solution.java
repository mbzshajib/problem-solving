package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:28 PM.
 */
public class RemoveNthNodeFromEndOfList_Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        if (head.next == null) return null;
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        n = count - n + 1;
        if (n == 1) {
            head = head.next;
            return head;
        }
        node = head;
        count = 1;
        while (node != null) {
            count++;
            if (count == n) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        return head;
    }
}
