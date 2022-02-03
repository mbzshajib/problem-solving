package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 11:06 AM.
 */

public class KeysAndRooms_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new KeysAndRooms_Solution().canVisitAllRooms(Arrays.asList(new List[]{Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList()})));
        Assertions.assertFalse(new KeysAndRooms_Solution().canVisitAllRooms(Arrays.asList(new List[]{Arrays.asList(1, 3), Arrays.asList(3, 0, 1), Arrays.asList(2), Arrays.asList(0)})));
    }
}
