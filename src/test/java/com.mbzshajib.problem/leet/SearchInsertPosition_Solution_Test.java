package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/17/2022 at 6:30 PM.
 */

public class SearchInsertPosition_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(2, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assertions.assertEquals(1, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assertions.assertEquals(4, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assertions.assertEquals(2, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 5));
        Assertions.assertEquals(1, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 2));
        Assertions.assertEquals(4, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 7));
        Assertions.assertEquals(5, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 17));
    }
}
