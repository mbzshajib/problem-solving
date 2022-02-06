package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/5/2022 at 5:59 PM.
 */
public class XOfAKindInADeckOfCards_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{111, 111, 111}));
        Assertions.assertTrue(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        Assertions.assertFalse(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{0}));

        Assertions.assertTrue(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1, 2, 3, 4, 5, 6}));
        Assertions.assertTrue(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2, 3, 3}));

        Assertions.assertFalse(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        Assertions.assertFalse(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        Assertions.assertFalse(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1}));
        Assertions.assertTrue(new XOfAKindInADeckOfCards_Solution().hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2}));
    }

}
