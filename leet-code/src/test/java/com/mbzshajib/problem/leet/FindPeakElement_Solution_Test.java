package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/23/2022 at 5:50 PM.
 */
@Suite
public class FindPeakElement_Solution_Test {
    @Test
    void allTest(){
        Assert.assertEquals(2,new FindPeakElement_Solution().findPeakElement(new int[]{1,2,3,1}));
        Assert.assertEquals(5,new FindPeakElement_Solution().findPeakElement(new int[]{1,2,3,4,5,6}));
        Assert.assertEquals(0,new FindPeakElement_Solution().findPeakElement(new int[]{6,5,4,3,2,1}));

    }
}
