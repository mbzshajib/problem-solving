package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 1:23 PM.
 */

public class FindSmallestLetterGreaterThanTarget_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals('c',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'a'));
        Assertions.assertEquals('f',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'c'));
        Assertions.assertEquals('f',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'d'));
        Assertions.assertEquals('c',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'j'));
        Assertions.assertEquals('a',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'a', 'b'},'z'));
    }
}
