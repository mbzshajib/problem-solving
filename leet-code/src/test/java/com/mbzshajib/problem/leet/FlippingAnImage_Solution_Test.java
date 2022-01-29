package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 12:06 PM.
 */
@Suite
public class FlippingAnImage_Solution_Test {
    @Test
    void testAll() {
        Helper.check2DMatrix(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new FlippingAnImage_Solution().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}));
        Helper.check2DMatrix(new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}, new FlippingAnImage_Solution().flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}));
    }
}
