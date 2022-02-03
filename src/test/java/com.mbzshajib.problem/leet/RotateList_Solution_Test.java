package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 11:26 AM.
 */

public class RotateList_Solution_Test {
    @Test
    void testAll() {
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{4, 5, 1, 2, 3}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 2)
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{4, 5, 1, 2, 3}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 7)
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 0)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 5)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 2, 3, 4, 5}), 10)
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{3, 3, 1, 1, 2, 2}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 1, 2, 2, 3, 3}), 2)
        );

        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{3, 3, 1, 1, 2, 2}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 1, 2, 2, 3, 3}), 8)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{3, 1, 1, 2, 2, 3}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 1, 2, 2, 3, 3}), 1)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{3, 1, 1, 2, 2, 3}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1, 1, 2, 2, 3, 3}), 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{}), 7)
        );
        Helper.validateSameList(
                Utils.prepareLinkList(new Integer[]{1}),
                new RotateList_Solution().rotateRight(Utils.prepareLinkList(new Integer[]{1}), 99)
        );
    }
}
