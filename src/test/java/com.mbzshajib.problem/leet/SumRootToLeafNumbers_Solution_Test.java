package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:18 AM.
 */

public class SumRootToLeafNumbers_Solution_Test {
    @Test
    void allTest() {
        Assertions.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{1, 2, 3})), 25);
        Assertions.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{4,9,0,5,1})), 1026);
        Assertions.assertEquals(new SumRootToLeafNumbers_Solution().sumNumbers(Utils.prepareTree(new Integer[]{1,2,3,4,5,6,7})), 522);
    }
}
