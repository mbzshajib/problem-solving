package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:24 PM.
 */
public class AddStrings_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals("12", new AddStrings_Solution().addStrings("10", "2"));
        Assertions.assertEquals("134", new AddStrings_Solution().addStrings("11", "123"));
        Assertions.assertEquals("533", new AddStrings_Solution().addStrings("456", "77"));
        Assertions.assertEquals("0", new AddStrings_Solution().addStrings("0", "0"));
    }
}
