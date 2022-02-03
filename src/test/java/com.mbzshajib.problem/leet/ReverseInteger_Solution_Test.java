package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:22 PM.
 */

public class ReverseInteger_Solution_Test {
    @Test
    void allTest() {
        int max =  Integer.MAX_VALUE;
        System.out.println(max);
        Assertions.assertEquals(-333, new ReverseInteger_Solution().reverse(-333));
        Assertions.assertEquals(321, new ReverseInteger_Solution().reverse(123));
        Assertions.assertEquals(0, new ReverseInteger_Solution().reverse(0));
        Assertions.assertEquals(-1, new ReverseInteger_Solution().reverse(-1));
        Assertions.assertEquals(333, new ReverseInteger_Solution().reverse(333));
        Assertions.assertEquals(-21, new ReverseInteger_Solution().reverse(-120));
        Assertions.assertEquals(-21, new ReverseInteger_Solution().reverse(-120));
        Assertions.assertEquals(0, new ReverseInteger_Solution().reverse(1534236469));
        Assertions.assertEquals(0, new ReverseInteger_Solution().reverse(2147483647));
        Assertions.assertEquals(214748364, new ReverseInteger_Solution().reverse(463847412));
        Assertions.assertEquals(0, new ReverseInteger_Solution().reverse(Integer.MAX_VALUE));
        Assertions.assertEquals(0, new ReverseInteger_Solution().reverse(-2147483648));
    }
}