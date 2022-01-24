package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 1:23 PM.
 */
@Suite
public class FindSmallestLetterGreaterThanTarget_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals('c',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'a'));
        Assert.assertEquals('f',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'c'));
        Assert.assertEquals('f',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'d'));
        Assert.assertEquals('c',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'c','f','j'},'j'));
        Assert.assertEquals('a',new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(new char[]{'a', 'b'},'z'));
    }
}
