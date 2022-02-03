package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 11:06 AM.
 */

public class SearchInRotatedSortedArray_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(4, new SearchInRotatedSortedArray_Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        Assertions.assertEquals(-1, new SearchInRotatedSortedArray_Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        Assertions.assertEquals(-1, new SearchInRotatedSortedArray_Solution().search(new int[]{1}, 0));
        Assertions.assertEquals(0, new SearchInRotatedSortedArray_Solution().search(new int[]{1}, 1));
        Assertions.assertEquals(-1, new SearchInRotatedSortedArray_Solution().search(new int[]{1, 3}, 2));
        Assertions.assertEquals(0, new SearchInRotatedSortedArray_Solution().search(new int[]{5, 1, 3}, 5));
    }
}
