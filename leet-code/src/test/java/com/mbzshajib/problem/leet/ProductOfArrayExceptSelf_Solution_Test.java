package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import javax.xml.validation.Validator;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 11:57 PM.
 */
@Suite
public class ProductOfArrayExceptSelf_Solution_Test {
    @Test
    void testALl() {
        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, new ProductOfArrayExceptSelf_Solution().productExceptSelf(new int[]{1, 2, 3, 4}));
        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, new ProductOfArrayExceptSelf_Solution().productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, new ProductOfArrayExceptSelf_Solution().productExceptSelf(new int[]{-1, 1, 0, -3, 0}));

    }
}
