package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/13/2022 at 5:39 PM.
 */
public class AddTwoNumbers_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int oneInHand = 0;
        ListNode node = null;
        ListNode result = null;
        ListNode cur1 = l1, cur2 = l2;
        while (cur1 != null || cur2 != null) {
            int left = 0, right = 0;
            if (cur1 != null) {
                left = cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                right = cur2.val;
                cur2 = cur2.next;
            }
            int sum = left + right + oneInHand;
            if (sum >= 10) oneInHand = 1;
            else oneInHand = 0;
            ListNode tmp = new ListNode(sum % 10);
            if (node == null) {
                node = tmp;
                result = tmp;
            } else {
                node.next = tmp;
                node = tmp;
            }
        }
        if (oneInHand == 1) {
            ListNode tmp = new ListNode(1);
            node.next = tmp;
        }
        ListNode test = result;
        while (test != null) {
            System.out.println(test.next);
            test = test.next;
        }
        return result;
    }
}
