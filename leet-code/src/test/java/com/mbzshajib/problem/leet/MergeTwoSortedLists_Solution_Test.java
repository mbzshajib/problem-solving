package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:00 PM.
 */
@Suite
public class MergeTwoSortedLists_Solution_Test {
    @Test
    void allTest() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{}),
                        Utils.prepareLinkList(new Integer[]{})
                )
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{0}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{}),
                        Utils.prepareLinkList(new Integer[]{0})
                )
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{0}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{0}),
                        Utils.prepareLinkList(new Integer[]{})
                )
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 1, 2, 3, 4, 4}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{1, 2, 4}),
                        Utils.prepareLinkList(new Integer[]{1, 3, 4})
                )
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 1, 2, 3, 4, 4, 5}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{1, 2, 4}),
                        Utils.prepareLinkList(new Integer[]{1, 3, 4, 5})
                )
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 1, 2, 3, 4, 4, 5}),
                new MergeTwoSortedLists_Solution().mergeTwoLists(
                        Utils.prepareLinkList(new Integer[]{1, 2, 4, 5}),
                        Utils.prepareLinkList(new Integer[]{1, 3, 4})
                )
        );

    }
}
