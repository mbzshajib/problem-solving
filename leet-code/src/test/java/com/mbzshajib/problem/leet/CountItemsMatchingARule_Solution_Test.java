package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:37 AM.
 */
@Suite
public class CountItemsMatchingARule_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(1, new CountItemsMatchingARule_Solution().countMatches(Arrays.asList(new List[]{
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        }),"color","silver"));
        Assertions.assertEquals(2, new CountItemsMatchingARule_Solution().countMatches(Arrays.asList(new List[]{
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone")
        }),"type","phone"));
    }
}
