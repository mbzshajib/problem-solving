package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 10:27 AM.
 */
public class RemoveDuplicatesFromSortedList_Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }

    private void removeNode(ListNode parent, ListNode node, ListNode child) {
        parent.next = child;
        node.next = null;
    }
}
