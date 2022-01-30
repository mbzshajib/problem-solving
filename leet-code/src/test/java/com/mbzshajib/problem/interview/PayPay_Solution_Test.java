package com.mbzshajib.problem.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/30/2022 at 7:32 PM.
 */
@Suite
public class PayPay_Solution_Test {
    @Test
    void testAll_Problem001() {
        Assertions.assertArrayEquals(new int[]{2, 3, 5}, new PayPay_Solution().solution1(new int[]{25, 2, 3, 57, 38, 41}));
        Assertions.assertArrayEquals(new int[]{0}, new PayPay_Solution().solution1(new int[]{250, 20, 30, 57, 38, 41}));
        Assertions.assertArrayEquals(new int[]{0, 3}, new PayPay_Solution().solution1(new int[]{250, 200, 330, 57, 38, 431}));

    }

    @Test
    void testAll_Problem002() {
        Assertions.assertEquals(5, new PayPay_Solution().solution2("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        Assertions.assertEquals(0, new PayPay_Solution().solution2("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
        Assertions.assertEquals(0, new PayPay_Solution().solution2("hit", "cog", new String[]{"hot", "dog"}));
        Assertions.assertEquals(0, new PayPay_Solution().solution2("a", "c", new String[]{"a", "b", "c"}));
        Assertions.assertEquals(4, new PayPay_Solution().solution2("ta", "if", new String[]{"ts", "sc", "ph", "ca", "jr", "hf", "to", "if", "ha", "is", "io", "cf", "ta"}));
    }
}
