package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:54 PM.
 */
@Suite
public class ZigzagConversion_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals("PAHNAPLSIIGYIR",new ZigzagConversion_Solution().convert("PAYPALISHIRING",3));
        Assert.assertEquals("PINALSIGYAHRPI",new ZigzagConversion_Solution().convert("PAYPALISHIRING",4));
        Assert.assertEquals("A",new ZigzagConversion_Solution().convert("A",1));
    }
}
