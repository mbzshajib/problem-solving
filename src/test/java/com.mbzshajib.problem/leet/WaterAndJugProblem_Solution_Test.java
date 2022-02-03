package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 8:53 PM.
 */
public class WaterAndJugProblem_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new WaterAndJugProblem_Solution().canMeasureWater(11, 3, 13));
        Assertions.assertTrue(new WaterAndJugProblem_Solution().canMeasureWater(3, 5, 4));
        Assertions.assertTrue(new WaterAndJugProblem_Solution().canMeasureWater(1, 2, 3));
        Assertions.assertFalse(new WaterAndJugProblem_Solution().canMeasureWater(2, 6, 5));
        Assertions.assertTrue(new WaterAndJugProblem_Solution().canMeasureWater(104639, 104651, 234));

    }
}
