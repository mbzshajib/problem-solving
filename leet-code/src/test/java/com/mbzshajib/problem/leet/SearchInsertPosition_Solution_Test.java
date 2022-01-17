package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/17/2022 at 6:30 PM.
 */
@Suite
public class SearchInsertPosition_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(2, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assert.assertEquals(1, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assert.assertEquals(4, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assert.assertEquals(2, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 5));
        Assert.assertEquals(1, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 2));
        Assert.assertEquals(4, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 7));
        Assert.assertEquals(5, new SearchInsertPosition_Solution().searchInsert(new int[]{1, 3, 5, 6,9}, 17));
    }
}
