package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:50 PM.
 */

public class FindFirstAndLastPositionOfElementInSortedArray_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertArrayEquals(
                new int[]{-1,-1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{}, -1)
        );
        Assertions.assertArrayEquals(
                new int[]{3, 4},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)
        );
        Assertions.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{}, 0)
        );

        Assertions.assertArrayEquals(
                new int[]{0, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 1, 2, 3, 4, 5, 6}, 1)
        );
        Assertions.assertArrayEquals(
                new int[]{0, 0},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 1)
        );
        Assertions.assertArrayEquals(
                new int[]{1, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 2)
        );
        Assertions.assertArrayEquals(
                new int[]{1, 2},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 2, 3, 4, 5, 6}, 2)
        );
        Assertions.assertArrayEquals(
                new int[]{1, 1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 2)
        );
        Assertions.assertArrayEquals(
                new int[]{5, 6},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 6)
        );
        Assertions.assertArrayEquals(
                new int[]{5, 5},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 6)
        );
        Assertions.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 7)
        );
        Assertions.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 6}, 0)
        );
        Assertions.assertArrayEquals(
                new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray_Solution().searchRange(new int[]{1, 2, 3, 4, 5, 6, 8}, 7)
        );

    }
}
