package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:29 PM.
 */
@Suite
public class RemoveNthNodeFromEndOfList_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{}), 0)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1}), 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1}), 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 5}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 2)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 3, 4, 5}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 5)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 6}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6}), 2)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 3, 4, 5, 6}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6}), 6)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6}), 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new RemoveNthNodeFromEndOfList_Solution().removeNthFromEnd(Utils.prepareLinkList(new Integer[]{1, 2}), 1)
        );

    }
}
