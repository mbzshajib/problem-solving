package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 11:26 AM.
 */
public class RotateList_Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        ListNode curr = head;
        int count = 0;
        ListNode first = head, last = null, move = null;
        while (curr != null) {
            if (curr.next == null) last = curr;
            count++;
            curr = curr.next;
        }
        if (k > count) {
            k = k % count;
        }
        k = count - k;
        if (k == count || k == 0) return head;
        count = 0;
        curr = head;
        while (curr != null) {
            count++;
            if (count == k) {
                move = curr;
                break;
            }
            curr = curr.next;
        }
        head = move.next;
        last.next = first;
        move.next = null;
        return head;
    }
}
