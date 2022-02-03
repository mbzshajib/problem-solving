package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:09 PM.
 */

public class SortingTheSentence_Solution_Test {
    @Test
    void testAll() {
//        Assertions.assertEquals("", new SortingTheSentence_Solution().sortSentence(""));
        Assertions.assertEquals("This is a sentence", new SortingTheSentence_Solution().sortSentence("is2 sentence4 This1 a3"));
        Assertions.assertEquals("Me Myself and I", new SortingTheSentence_Solution().sortSentence("Myself2 Me1 I4 and3"));
    }
}
