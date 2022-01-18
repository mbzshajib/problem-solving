package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:27 PM.
 */
public class ReverseLinkedList_Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = null;
        ListNode node = null;
        while (head != null) {
            ListNode tmp = new ListNode(head.val);
            if (node != null) {
                tmp.next = node;
                node = tmp;
            } else {
                node = tmp;
            }
            if (head.next == null) {
                result = tmp;
            }
            head = head.next;
        }
        return result;
    }
}
