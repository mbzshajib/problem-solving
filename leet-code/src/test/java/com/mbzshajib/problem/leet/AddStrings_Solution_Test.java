package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:24 PM.
 */
@Suite
public class AddStrings_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals("12", new AddStrings_Solution().addStrings("10", "2"));
        Assert.assertEquals("134", new AddStrings_Solution().addStrings("11", "123"));
        Assert.assertEquals("533", new AddStrings_Solution().addStrings("456", "77"));
        Assert.assertEquals("0", new AddStrings_Solution().addStrings("0", "0"));
    }
}
