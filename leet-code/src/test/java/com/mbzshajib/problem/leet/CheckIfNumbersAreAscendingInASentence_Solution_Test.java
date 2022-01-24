package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 3:49 PM.
 */
@Suite
public class CheckIfNumbersAreAscendingInASentence_Solution_Test {
    @Test
    void testAll() {
        Assert.assertTrue(new CheckIfNumbersAreAscendingInASentence_Solution().areNumbersAscending(""));
        Assert.assertTrue(new CheckIfNumbersAreAscendingInASentence_Solution().areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));

        Assert.assertFalse(new CheckIfNumbersAreAscendingInASentence_Solution().areNumbersAscending("hello world 5 x 5"));
        Assert.assertFalse(new CheckIfNumbersAreAscendingInASentence_Solution().areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }
}
