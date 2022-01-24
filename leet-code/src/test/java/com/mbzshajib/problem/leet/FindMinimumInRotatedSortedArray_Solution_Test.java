package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 10:42 AM.
 */
@Suite
public class FindMinimumInRotatedSortedArray_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(1, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        Assert.assertEquals(1, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{3, 4, 5, 1, 2}));
        Assert.assertEquals(11, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{11, 13, 15, 17}));
        Assert.assertEquals(1, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{3,1,2}));
        Assert.assertEquals(1, new FindMinimumInRotatedSortedArray_Solution().findMin(new int[]{2,3,4,5,1}));
    }

}
