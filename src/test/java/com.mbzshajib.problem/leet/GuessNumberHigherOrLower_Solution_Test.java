package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:40 AM.
 */

public class GuessNumberHigherOrLower_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(1702766719, new GuessNumberHigherOrLower_Solution(1702766719).guessNumber(2126753390));

        Assertions.assertEquals(1, new GuessNumberHigherOrLower_Solution(1).guessNumber(10));
        Assertions.assertEquals(2, new GuessNumberHigherOrLower_Solution(2).guessNumber(10));
        Assertions.assertEquals(3, new GuessNumberHigherOrLower_Solution(3).guessNumber(10));
        Assertions.assertEquals(4, new GuessNumberHigherOrLower_Solution(4).guessNumber(10));
        Assertions.assertEquals(5, new GuessNumberHigherOrLower_Solution(5).guessNumber(10));
        Assertions.assertEquals(6, new GuessNumberHigherOrLower_Solution(6).guessNumber(10));
        Assertions.assertEquals(7, new GuessNumberHigherOrLower_Solution(7).guessNumber(10));
        Assertions.assertEquals(8, new GuessNumberHigherOrLower_Solution(8).guessNumber(10));
        Assertions.assertEquals(9, new GuessNumberHigherOrLower_Solution(9).guessNumber(10));
        Assertions.assertEquals(10, new GuessNumberHigherOrLower_Solution(10).guessNumber(10));
        Assertions.assertEquals(1, new GuessNumberHigherOrLower_Solution(1).guessNumber(11));
        Assertions.assertEquals(2, new GuessNumberHigherOrLower_Solution(2).guessNumber(11));
        Assertions.assertEquals(3, new GuessNumberHigherOrLower_Solution(3).guessNumber(11));
        Assertions.assertEquals(4, new GuessNumberHigherOrLower_Solution(4).guessNumber(11));
        Assertions.assertEquals(5, new GuessNumberHigherOrLower_Solution(5).guessNumber(11));
        Assertions.assertEquals(6, new GuessNumberHigherOrLower_Solution(6).guessNumber(11));
        Assertions.assertEquals(7, new GuessNumberHigherOrLower_Solution(7).guessNumber(11));
        Assertions.assertEquals(8, new GuessNumberHigherOrLower_Solution(8).guessNumber(11));
        Assertions.assertEquals(9, new GuessNumberHigherOrLower_Solution(9).guessNumber(11));
        Assertions.assertEquals(10, new GuessNumberHigherOrLower_Solution(10).guessNumber(11));
        Assertions.assertEquals(11, new GuessNumberHigherOrLower_Solution(11).guessNumber(11));


    }
}
