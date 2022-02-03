package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 10:27 AM.
 */

public class RemoveDuplicatesFromSortedList_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2}),
                new RemoveDuplicatesFromSortedList_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 2}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3}),
                new RemoveDuplicatesFromSortedList_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 2, 3, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3}),
                new RemoveDuplicatesFromSortedList_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 2, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new RemoveDuplicatesFromSortedList_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new RemoveDuplicatesFromSortedList_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 1}))
        );

    }
}
