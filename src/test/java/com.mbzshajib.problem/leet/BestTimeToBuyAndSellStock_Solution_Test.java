package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 12:12 AM.
 */
public class BestTimeToBuyAndSellStock_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(5, new BestTimeToBuyAndSellStock_Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(0, new BestTimeToBuyAndSellStock_Solution().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}
