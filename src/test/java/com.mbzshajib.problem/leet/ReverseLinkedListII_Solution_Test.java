package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 4:43 PM.
 */

public class ReverseLinkedListII_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{}), 0, 0)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{5}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{5}), 1, 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 4, 3, 2, 5}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 2, 4)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 7, 6, 5, 4, 3, 8, 9}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 3, 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 8, 7, 6, 5, 4, 9}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 4, 5, 6, 7, 8, 9}), 3, 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 8, 6, 5, 4, 3, 9}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 8, 9}), 3, 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 9, 8, 6, 5, 4}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 4, 5, 6, 8, 9}), 3, 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 1, 9)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 9, 9)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
                new ReverseLinkedListII_Solution().reverseBetween(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 1, 1)
        );

    }
}
