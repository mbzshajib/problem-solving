package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:22 PM.
 */
@Suite
public class ReverseInteger_Solution_Test {
    @Test
    void allTest() {
        int max =  Integer.MAX_VALUE;
        System.out.println(max);
        Assert.assertEquals(-333, new ReverseInteger_Solution().reverse(-333));
        Assert.assertEquals(321, new ReverseInteger_Solution().reverse(123));
        Assert.assertEquals(0, new ReverseInteger_Solution().reverse(0));
        Assert.assertEquals(-1, new ReverseInteger_Solution().reverse(-1));
        Assert.assertEquals(333, new ReverseInteger_Solution().reverse(333));
        Assert.assertEquals(-21, new ReverseInteger_Solution().reverse(-120));
        Assert.assertEquals(-21, new ReverseInteger_Solution().reverse(-120));
        Assert.assertEquals(0, new ReverseInteger_Solution().reverse(1534236469));
        Assert.assertEquals(0, new ReverseInteger_Solution().reverse(2147483647));
        Assert.assertEquals(214748364, new ReverseInteger_Solution().reverse(463847412));
        Assert.assertEquals(0, new ReverseInteger_Solution().reverse(Integer.MAX_VALUE));
        Assert.assertEquals(0, new ReverseInteger_Solution().reverse(-2147483648));
    }
}