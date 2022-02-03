package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 2:45 PM.
 */
public class StringToIntegerAtoi_Solution_Test {
    @Test
    void allTest() {
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("0000+5"));
        Assertions.assertEquals(5, new StringToIntegerAtoi_Solution().myAtoi("+00005"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("+00000"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi(""));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("+"));

        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("   0000+5"));
        Assertions.assertEquals(5, new StringToIntegerAtoi_Solution().myAtoi("   +00005"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("   +00000"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("   "));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("   +"));

        Assertions.assertEquals(42, new StringToIntegerAtoi_Solution().myAtoi("42"));
        Assertions.assertEquals(-42, new StringToIntegerAtoi_Solution().myAtoi("   -42"));
        Assertions.assertEquals(4193, new StringToIntegerAtoi_Solution().myAtoi("4193 with words"));

        Assertions.assertEquals(-2147483648, new StringToIntegerAtoi_Solution().myAtoi("-91283472332"));

        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("--12"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("-+12"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("+-12"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("++12"));

        Assertions.assertEquals(Integer.MAX_VALUE, new StringToIntegerAtoi_Solution().myAtoi("21474836460"));
        Assertions.assertEquals(0, new StringToIntegerAtoi_Solution().myAtoi("00000-42a1234"));
        Assertions.assertEquals(-5, new StringToIntegerAtoi_Solution().myAtoi("-5-"));
    }
}
