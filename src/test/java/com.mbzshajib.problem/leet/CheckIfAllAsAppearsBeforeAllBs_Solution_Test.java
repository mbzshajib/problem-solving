package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:40 PM.
 */
public class CheckIfAllAsAppearsBeforeAllBs_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString(""));
        Assertions.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("aaabbb"));
        Assertions.assertTrue(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("bbb"));

        Assertions.assertFalse(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("abab"));
        Assertions.assertFalse(new CheckIfAllAsAppearsBeforeAllBs_Solution().checkString("aaba"));
    }
}
