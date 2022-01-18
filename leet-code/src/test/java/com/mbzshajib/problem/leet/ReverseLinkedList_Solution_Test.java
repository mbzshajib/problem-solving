package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:28 PM.
 */
@Suite
public class ReverseLinkedList_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new ReverseLinkedList_Solution().reverseList(Utils.prepareLinkList(new Integer[]{}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new ReverseLinkedList_Solution().reverseList(Utils.prepareLinkList(new Integer[]{1}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{5, 4, 3, 2, 1}),
                new ReverseLinkedList_Solution().reverseList(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{6, 5, 4, 3, 2, 1}),
                new ReverseLinkedList_Solution().reverseList(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6}))
        );
    }
}
