package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:09 PM.
 */
@Suite
public class SortingTheSentence_Solution_Test {
    @Test
    void testAll() {
//        Assert.assertEquals("", new SortingTheSentence_Solution().sortSentence(""));
        Assert.assertEquals("This is a sentence", new SortingTheSentence_Solution().sortSentence("is2 sentence4 This1 a3"));
        Assert.assertEquals("Me Myself and I", new SortingTheSentence_Solution().sortSentence("Myself2 Me1 I4 and3"));
    }
}
