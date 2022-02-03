package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 6:22 PM.
 */
@Suite
public class EvaluateTheBracketPairsOfAString_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals("bobistwoyearsold", new EvaluateTheBracketPairsOfAString_Solution().evaluate("(name)is(age)yearsold", Arrays.asList(
                Arrays.asList("name", "bob"),
                Arrays.asList("age", "two")
        )));
        Assertions.assertEquals("hi?", new EvaluateTheBracketPairsOfAString_Solution().evaluate("hi(name)", Arrays.asList(
                Arrays.asList("a","b")
        )));
        Assertions.assertEquals("yesyesyesaaa", new EvaluateTheBracketPairsOfAString_Solution().evaluate("(a)(a)(a)aaa", Arrays.asList(
                Arrays.asList("a","yes")
        )));

    }
}
