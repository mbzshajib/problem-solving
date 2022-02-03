package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:26 AM.
 */

public class LengthOfLastWord_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(5, new LengthOfLastWord_Solution().lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, new LengthOfLastWord_Solution().lengthOfLastWord("   fly me   to   the moon  "));
        Assertions.assertEquals(3, new LengthOfLastWord_Solution().lengthOfLastWord("   fly me   to   the   "));
        Assertions.assertNotEquals(6, new LengthOfLastWord_Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}
