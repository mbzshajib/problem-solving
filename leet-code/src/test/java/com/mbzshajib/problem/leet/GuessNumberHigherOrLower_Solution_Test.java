package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:40 AM.
 */
@Suite
public class GuessNumberHigherOrLower_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(1702766719, new GuessNumberHigherOrLower_Solution(1702766719).guessNumber(2126753390));

        Assert.assertEquals(1, new GuessNumberHigherOrLower_Solution(1).guessNumber(10));
        Assert.assertEquals(2, new GuessNumberHigherOrLower_Solution(2).guessNumber(10));
        Assert.assertEquals(3, new GuessNumberHigherOrLower_Solution(3).guessNumber(10));
        Assert.assertEquals(4, new GuessNumberHigherOrLower_Solution(4).guessNumber(10));
        Assert.assertEquals(5, new GuessNumberHigherOrLower_Solution(5).guessNumber(10));
        Assert.assertEquals(6, new GuessNumberHigherOrLower_Solution(6).guessNumber(10));
        Assert.assertEquals(7, new GuessNumberHigherOrLower_Solution(7).guessNumber(10));
        Assert.assertEquals(8, new GuessNumberHigherOrLower_Solution(8).guessNumber(10));
        Assert.assertEquals(9, new GuessNumberHigherOrLower_Solution(9).guessNumber(10));
        Assert.assertEquals(10, new GuessNumberHigherOrLower_Solution(10).guessNumber(10));
        Assert.assertEquals(1, new GuessNumberHigherOrLower_Solution(1).guessNumber(11));
        Assert.assertEquals(2, new GuessNumberHigherOrLower_Solution(2).guessNumber(11));
        Assert.assertEquals(3, new GuessNumberHigherOrLower_Solution(3).guessNumber(11));
        Assert.assertEquals(4, new GuessNumberHigherOrLower_Solution(4).guessNumber(11));
        Assert.assertEquals(5, new GuessNumberHigherOrLower_Solution(5).guessNumber(11));
        Assert.assertEquals(6, new GuessNumberHigherOrLower_Solution(6).guessNumber(11));
        Assert.assertEquals(7, new GuessNumberHigherOrLower_Solution(7).guessNumber(11));
        Assert.assertEquals(8, new GuessNumberHigherOrLower_Solution(8).guessNumber(11));
        Assert.assertEquals(9, new GuessNumberHigherOrLower_Solution(9).guessNumber(11));
        Assert.assertEquals(10, new GuessNumberHigherOrLower_Solution(10).guessNumber(11));
        Assert.assertEquals(11, new GuessNumberHigherOrLower_Solution(11).guessNumber(11));


    }
}
