package com.mbzshajib.problem.leet;

import org.w3c.dom.NodeList;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:25 PM.
 */

public class SwapNodesInPairs_Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode parent = null, curr = head, next = head.next;
        curr.next = head.next.next;
        next.next = head;
        parent = head;
        head = next;
        curr = head.next.next;
        if (curr == null) return head;
        next = head.next.next.next;
        if (next == null) return head;


        while (curr != null && next != null) {
            ListNode tmpParent = parent, tmpCurr = curr, tmpNext = next, tmpNextNext = next.next;

            curr.next = tmpNextNext;
            next.next = tmpCurr;
            parent.next = tmpNext;

            parent = curr;
            curr = curr.next;
            if (curr != null) next = curr.next;
            else next = null;
        }
        return head;
    }
}
