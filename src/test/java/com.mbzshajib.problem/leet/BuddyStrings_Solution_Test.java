package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/5/2022 at 5:17 PM.
 */
public class BuddyStrings_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("abc", "abcd"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("ABCD", "abcd"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("abcd", "badc"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("abcd", "efgh"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("abcd", "abde"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("ab", "ab"));
        Assertions.assertFalse(new BuddyStrings_Solution().buddyStrings("abcd","abcd"));

        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("aa", "aa"));
        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("abc", "bac"));
        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("abc", "cba"));
        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("abc", "acb"));

        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("abcd", "bacd"));
        Assertions.assertTrue(new BuddyStrings_Solution().buddyStrings("abcd", "abdc"));

    }
}
