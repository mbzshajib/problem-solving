package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 10:54 AM.
 */
public class RemoveDuplicatesFromSortedListII_Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode parent = null;
        ListNode curr = head;
        boolean isDuplicate = false;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
                isDuplicate = true;
            } else {
                if (isDuplicate) {
                    if (parent == null) {
                        head = curr.next;
                        curr = head;
                    } else {
                        parent.next = curr.next;
                        curr = parent.next;
                    }
                    isDuplicate = false;
                } else {
                    parent = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
}
