package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 1:07 PM.
 */
@Suite
public class FindTheDuplicateNumber_Solution_Test {
    @Test
    void testAll(){
        Assert.assertEquals(2,new FindTheDuplicateNumber_Solution().findDuplicate(new int[]{1,3,4,2,2}));
        Assert.assertEquals(3,new FindTheDuplicateNumber_Solution().findDuplicate(new int[]{3,1,3,4,2}));
    }
}
