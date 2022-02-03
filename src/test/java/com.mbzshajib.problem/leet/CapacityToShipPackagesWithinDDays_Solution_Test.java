package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:08 AM.
 */
public class CapacityToShipPackagesWithinDDays_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(15, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        Assertions.assertEquals(55, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
        Assertions.assertEquals(10, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        Assertions.assertEquals(6, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
        Assertions.assertEquals(16, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 1));
        Assertions.assertEquals(4, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 6));
        Assertions.assertEquals(3, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
        Assertions.assertEquals(8, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 1));
        Assertions.assertEquals(3, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 5));
        Assertions.assertEquals(160, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{10,50,100,100,50,100,100,100}, 5));

    }
}
