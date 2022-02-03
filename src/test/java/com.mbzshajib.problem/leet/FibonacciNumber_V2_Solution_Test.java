package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 4:44 PM.
 */
public class FibonacciNumber_V2_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(0,new FibonacciNumber_V2_Solution().fib(0));
        Assertions.assertEquals(1,new FibonacciNumber_V2_Solution().fib(1));
        Assertions.assertEquals(1,new FibonacciNumber_V2_Solution().fib(2));
        Assertions.assertEquals(2,new FibonacciNumber_V2_Solution().fib(3));
        Assertions.assertEquals(3,new FibonacciNumber_V2_Solution().fib(4));
        Assertions.assertEquals(5,new FibonacciNumber_V2_Solution().fib(5));
        Assertions.assertEquals(832040,new FibonacciNumber_V2_Solution().fib(30));
    }
}
