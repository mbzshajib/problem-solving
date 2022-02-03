package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static com.mbzshajib.problem.leet.Helper.validateSameList;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/13/2022 at 5:39 PM.
 */
public class AddTwoNumbers_Solution_Test {
    @Test
    void testNull() {
        ListNode node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(null), Utils.prepareLinkList(null));
        Assertions.assertNull(node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(null), Utils.prepareLinkList(new Integer[]{2, 4, 5, 7, 8}));
        validateSameList(Utils.prepareLinkList(new Integer[]{2, 4, 5, 7, 8}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{1}), Utils.prepareLinkList(new Integer[]{9}));
        validateSameList(Utils.prepareLinkList(new Integer[]{0, 1}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{1, 0, 9}), Utils.prepareLinkList(new Integer[]{5}));
        validateSameList(Utils.prepareLinkList(new Integer[]{6, 0, 9}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9}), Utils.prepareLinkList(new Integer[]{1, 0, 9}));
        validateSameList(Utils.prepareLinkList(new Integer[]{0, 1, 9}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9, 9, 9}), Utils.prepareLinkList(new Integer[]{9, 9, 9}));
        validateSameList(Utils.prepareLinkList(new Integer[]{8, 9, 9, 1}), node);

        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{2, 4, 3}), Utils.prepareLinkList(new Integer[]{5, 6, 4}));
        validateSameList(Utils.prepareLinkList(new Integer[]{7, 0, 8}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{0}), Utils.prepareLinkList(new Integer[]{0}));
        validateSameList(Utils.prepareLinkList(new Integer[]{0}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9, 9, 9, 9, 9, 9, 9}), Utils.prepareLinkList(new Integer[]{9, 9, 9, 9}));
        validateSameList(Utils.prepareLinkList(new Integer[]{8, 9, 9, 9, 0, 0, 0, 1}), node);

    }


}
