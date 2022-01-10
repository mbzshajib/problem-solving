package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:18 AM.
 */
@Suite
public class SumRootToLeafNumbers_Solution_Test {
    @Test
    void allTest() {
        Assert.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{1, 2, 3})), 25);
        Assert.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{4,9,0,5,1})), 1026);
        Assert.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{1,2,3,4,5,6,7})), 522);
    }
}
