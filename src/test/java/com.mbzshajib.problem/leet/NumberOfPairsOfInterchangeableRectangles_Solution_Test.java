package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfPairsOfInterchangeableRectangles_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(6, new NumberOfPairsOfInterchangeableRectangles_Solution().interchangeableRectangles(new int[][]{{4, 8}, {3, 6}, {10, 20}, {15, 30}}));
        Assertions.assertEquals(0, new NumberOfPairsOfInterchangeableRectangles_Solution().interchangeableRectangles(new int[][] {{4,5},{7,8}}));
    }
}
