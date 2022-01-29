package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:07 PM.
 */
@Suite
public class ReverseWordsInAString_Solution_Test {
    @Test
    void testAll(){
        Assertions.assertEquals("blue is sky the",new ReverseWordsInAString_Solution().reverseWords("the sky is blue"));
        Assertions.assertEquals("world hello",new ReverseWordsInAString_Solution().reverseWords("  hello world  "));
        Assertions.assertEquals("example good a",new ReverseWordsInAString_Solution().reverseWords("a good   example"));
    }
}
