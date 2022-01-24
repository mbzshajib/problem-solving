package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:47 PM.
 */
@Suite
public class MinimumDeletionsToMakeStringBalanced_Solution_Test {
    @Test
    void test(){
        Assert.assertEquals(2,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("aababbab"));
        Assert.assertEquals(2,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("bbaaaaabb"));
        Assert.assertEquals(1,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("baaaaabb"));
    }
}
