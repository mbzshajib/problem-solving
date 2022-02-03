package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:00 PM.
 */
public class MergeTwoSortedLists_Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode newRoot = new ListNode();
        ListNode node = new ListNode();
        int count = 0;
        while (list1 != null || list2 != null) {
            ListNode tmp = null;
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    tmp = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    tmp = new ListNode(list2.val);
                    list2 = list2.next;
                }

            } else if (list1 != null) {
                tmp = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list2 != null) {
                tmp = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                break;
            }
            if (count == 0) {
                node = tmp;
                newRoot = node;
            } else {

                node.next = tmp;
                node = node.next;
            }
            count++;
        }
        return newRoot;
    }
}
