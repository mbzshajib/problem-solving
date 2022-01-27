package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/28/2022 at 1:56 AM.
 */
@Suite
public class N_thTribonacciNumber_Solution_Test {
    @Test
    void testAll(){
        Assertions.assertEquals(0,new N_thTribonacciNumber_Solution().tribonacci(0));
        Assertions.assertEquals(1,new N_thTribonacciNumber_Solution().tribonacci(1));
        Assertions.assertEquals(1,new N_thTribonacciNumber_Solution().tribonacci(2));
        Assertions.assertEquals(2,new N_thTribonacciNumber_Solution().tribonacci(3));
        Assertions.assertEquals(4,new N_thTribonacciNumber_Solution().tribonacci(4));
        Assertions.assertEquals(2082876103,new N_thTribonacciNumber_Solution().tribonacci(37));
    }
}
