package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:12 AM.
 */

public class FirstBadVersion_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(10));
        Assertions.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(1));
        Assertions.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(10));
        Assertions.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(10));
        Assertions.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(11));
        Assertions.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(10));
        Assertions.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(11));
        Assertions.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(10));
        Assertions.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(11));

        Assertions.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(5));
        Assertions.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(1));

        Assertions.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(10));
        Assertions.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(10));
        Assertions.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(10));
        Assertions.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(10));
        Assertions.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(10));
        Assertions.assertEquals(6, new FirstBadVersion_Solution(6).firstBadVersion(10));
        Assertions.assertEquals(7, new FirstBadVersion_Solution(7).firstBadVersion(10));
        Assertions.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(10));
        Assertions.assertEquals(9, new FirstBadVersion_Solution(9).firstBadVersion(10));
        Assertions.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(10));

        Assertions.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(11));
        Assertions.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(11));
        Assertions.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(11));
        Assertions.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(11));
        Assertions.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(11));
        Assertions.assertEquals(6, new FirstBadVersion_Solution(6).firstBadVersion(11));
        Assertions.assertEquals(7, new FirstBadVersion_Solution(7).firstBadVersion(11));
        Assertions.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(11));
        Assertions.assertEquals(9, new FirstBadVersion_Solution(9).firstBadVersion(11));
        Assertions.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(11));
        Assertions.assertEquals(11, new FirstBadVersion_Solution(11).firstBadVersion(11));

        Assertions.assertEquals(1702766719, new FirstBadVersion_Solution(1702766719).firstBadVersion(2126753390));


    }
}
