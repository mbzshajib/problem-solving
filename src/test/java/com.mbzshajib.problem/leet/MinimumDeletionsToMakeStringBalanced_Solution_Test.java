package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 5:47 PM.
 */

public class MinimumDeletionsToMakeStringBalanced_Solution_Test {
    @Test
    void test(){
        Assertions.assertEquals(2,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("aababbab"));
        Assertions.assertEquals(2,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("bbaaaaabb"));
        Assertions.assertEquals(1,new MinimumDeletionsToMakeStringBalanced_Solution().minimumDeletions("baaaaabb"));
    }
}
