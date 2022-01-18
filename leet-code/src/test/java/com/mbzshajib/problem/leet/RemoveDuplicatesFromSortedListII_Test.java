package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 10:54 AM.
 */
@Suite
public class RemoveDuplicatesFromSortedListII_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 5}),
                new RemoveDuplicatesFromSortedListII_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 2, 3, 3, 4, 4, 5}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 3}),
                new RemoveDuplicatesFromSortedListII_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 1, 2, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new RemoveDuplicatesFromSortedListII_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 1}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2}),
                new RemoveDuplicatesFromSortedListII_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 1, 1, 2, 3, 3, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new RemoveDuplicatesFromSortedListII_Solution().deleteDuplicates(Utils.prepareLinkList(new Integer[]{1, 3, 3, 3}))
        );
    }

}
