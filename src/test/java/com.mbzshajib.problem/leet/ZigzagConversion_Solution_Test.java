package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:54 PM.
 */
public class ZigzagConversion_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals("PAHNAPLSIIGYIR",new ZigzagConversion_Solution().convert("PAYPALISHIRING",3));
        Assertions.assertEquals("PINALSIGYAHRPI",new ZigzagConversion_Solution().convert("PAYPALISHIRING",4));
        Assertions.assertEquals("A",new ZigzagConversion_Solution().convert("A",1));
    }
}
