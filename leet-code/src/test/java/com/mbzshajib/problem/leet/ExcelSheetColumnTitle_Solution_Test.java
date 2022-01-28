package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 2:06 AM.
 */
@Suite
public class ExcelSheetColumnTitle_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals("A", new ExcelSheetColumnTitle_Solution().convertToTitle(1));
        Assertions.assertEquals("B", new ExcelSheetColumnTitle_Solution().convertToTitle(2));
        Assertions.assertEquals("Z", new ExcelSheetColumnTitle_Solution().convertToTitle(26));
        Assertions.assertEquals("AA", new ExcelSheetColumnTitle_Solution().convertToTitle(27));
        Assertions.assertEquals("AB", new ExcelSheetColumnTitle_Solution().convertToTitle(28));
        Assertions.assertEquals("ZY", new ExcelSheetColumnTitle_Solution().convertToTitle(701));
        Assertions.assertEquals("FXSHRXW", new ExcelSheetColumnTitle_Solution().convertToTitle(Integer.MAX_VALUE));
    }
}
