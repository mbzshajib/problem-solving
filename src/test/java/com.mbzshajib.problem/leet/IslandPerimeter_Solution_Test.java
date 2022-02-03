package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 4:01 PM.
 */

public class IslandPerimeter_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(16, new IslandPerimeter_Solution().islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        Assertions.assertEquals(0, new IslandPerimeter_Solution().islandPerimeter(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}));
        Assertions.assertEquals(4, new IslandPerimeter_Solution().islandPerimeter(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}}));
        Assertions.assertEquals(4, new IslandPerimeter_Solution().islandPerimeter(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}));
        Assertions.assertEquals(16, new IslandPerimeter_Solution().islandPerimeter(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));

    }
}
