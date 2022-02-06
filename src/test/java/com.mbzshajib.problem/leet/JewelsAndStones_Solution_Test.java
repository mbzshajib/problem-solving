package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JewelsAndStones_Solution_Test {
    @Test
    void testAll(){
        Assertions.assertEquals(3,new JewelsAndStones_Solution().numJewelsInStones("aA","aAAbbbb"));
        Assertions.assertEquals(0,new JewelsAndStones_Solution().numJewelsInStones("a","AAA"));
    }
}
