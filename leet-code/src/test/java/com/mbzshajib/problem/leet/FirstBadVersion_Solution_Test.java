package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:12 AM.
 */
@Suite
public class FirstBadVersion_Solution_Test {
    @Test
    void testAll() {
        Assert.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(10));
        Assert.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(1));
        Assert.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(10));
        Assert.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(10));
        Assert.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(11));
        Assert.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(10));
        Assert.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(11));
        Assert.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(10));
        Assert.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(11));

        Assert.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(5));
        Assert.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(1));

        Assert.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(10));
        Assert.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(10));
        Assert.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(10));
        Assert.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(10));
        Assert.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(10));
        Assert.assertEquals(6, new FirstBadVersion_Solution(6).firstBadVersion(10));
        Assert.assertEquals(7, new FirstBadVersion_Solution(7).firstBadVersion(10));
        Assert.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(10));
        Assert.assertEquals(9, new FirstBadVersion_Solution(9).firstBadVersion(10));
        Assert.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(10));

        Assert.assertEquals(1, new FirstBadVersion_Solution(1).firstBadVersion(11));
        Assert.assertEquals(2, new FirstBadVersion_Solution(2).firstBadVersion(11));
        Assert.assertEquals(3, new FirstBadVersion_Solution(3).firstBadVersion(11));
        Assert.assertEquals(4, new FirstBadVersion_Solution(4).firstBadVersion(11));
        Assert.assertEquals(5, new FirstBadVersion_Solution(5).firstBadVersion(11));
        Assert.assertEquals(6, new FirstBadVersion_Solution(6).firstBadVersion(11));
        Assert.assertEquals(7, new FirstBadVersion_Solution(7).firstBadVersion(11));
        Assert.assertEquals(8, new FirstBadVersion_Solution(8).firstBadVersion(11));
        Assert.assertEquals(9, new FirstBadVersion_Solution(9).firstBadVersion(11));
        Assert.assertEquals(10, new FirstBadVersion_Solution(10).firstBadVersion(11));
        Assert.assertEquals(11, new FirstBadVersion_Solution(11).firstBadVersion(11));

        Assert.assertEquals(1702766719, new FirstBadVersion_Solution(1702766719).firstBadVersion(2126753390));


    }
}
