package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:50 PM.
 */
@Suite
public class FindFirstAndLastPositionOfElementInSortedArray_Solution_Test {
    @Test
    void testAll() {
        Assert.assertArrayEquals(
                new int[]{-1,-1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{}, -1)
        );
        Assert.assertArrayEquals(
                new int[]{3, 4},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)
        );
        Assert.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{}, 0)
        );

        Assert.assertArrayEquals(
                new int[]{0, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 1, 2, 3, 4, 5, 6}, 1)
        );
        Assert.assertArrayEquals(
                new int[]{0, 0},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 1)
        );
        Assert.assertArrayEquals(
                new int[]{1, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 2)
        );
        Assert.assertArrayEquals(
                new int[]{1, 2},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 2, 3, 4, 5, 6}, 2)
        );
        Assert.assertArrayEquals(
                new int[]{1, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 2)
        );
        Assert.assertArrayEquals(
                new int[]{5, 6},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 6)
        );
        Assert.assertArrayEquals(
                new int[]{5, 5},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 6)
        );
        Assert.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 7)
        );
        Assert.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 0)
        );
        Assert.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 8}, 7)
        );

    }
}
