package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfGoodPairs_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(6, new NumberOfGoodPairs_Solution().numIdenticalPairs(new int[]{1, 1, 1, 1}));
        Assertions.assertEquals(4, new NumberOfGoodPairs_Solution().numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assertions.assertEquals(0, new NumberOfGoodPairs_Solution().numIdenticalPairs(new int[]{1, 2, 3}));
    }
}
