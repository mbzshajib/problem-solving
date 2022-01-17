package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:08 AM.
 */
@Suite
public class CapacityToShipPackagesWithinDDays_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(15, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        Assert.assertEquals(55, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
        Assert.assertEquals(10, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        Assert.assertEquals(6, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
        Assert.assertEquals(16, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 1));
        Assert.assertEquals(4, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 6));
        Assert.assertEquals(3, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
        Assert.assertEquals(8, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 1));
        Assert.assertEquals(3, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{1, 2, 3, 1, 1}, 5));
        Assert.assertEquals(160, new CapacityToShipPackagesWithinDDays_Solution().shipWithinDays(new int[]{10,50,100,100,50,100,100,100}, 5));

    }
}
