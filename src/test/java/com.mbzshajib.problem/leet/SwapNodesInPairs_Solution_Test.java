package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:25 PM.
 */

public class SwapNodesInPairs_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{}))
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1, 3}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1, 4, 3}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1, 3}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2, 3}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1, 4, 3, 5}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}))
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{2, 1, 4, 3, 6, 5}),
                new SwapNodesInPairs_Solution().swapPairs(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6}))
        );
    }

}
