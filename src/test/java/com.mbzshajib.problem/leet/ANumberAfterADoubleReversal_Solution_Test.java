package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:53 PM.
 */
public class ANumberAfterADoubleReversal_Solution_Test {
    @Test
    void allTest() {
        Assertions.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(526));
        Assertions.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(0));
        Assertions.assertTrue(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(0x000B));

        Assertions.assertFalse(new ANumberAfterADoubleReversal_Solution().isSameAfterReversals(1800));



    }
}
