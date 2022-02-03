package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:52 AM.
 */

public class ThousandSeparator_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals("0", new ThousandSeparator_Solution().thousandSeparator(0));
        Assertions.assertEquals("987", new ThousandSeparator_Solution().thousandSeparator(987));
        Assertions.assertEquals("1.987", new ThousandSeparator_Solution().thousandSeparator(1987));
        Assertions.assertEquals("100.987", new ThousandSeparator_Solution().thousandSeparator(100987));
        Assertions.assertEquals("87", new ThousandSeparator_Solution().thousandSeparator(87));
        Assertions.assertEquals("1.871.212.121", new ThousandSeparator_Solution().thousandSeparator(1871212121));
        Assertions.assertEquals("2.147.483.647", new ThousandSeparator_Solution().thousandSeparator(Integer.MAX_VALUE));
    }
}
