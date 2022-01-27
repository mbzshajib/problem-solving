package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/28/2022 at 12:56 AM.
 */
@Suite
public class FindCommonCharacters_Solution_Test {
    @Test
    void allTest() {
        Helper.matchTwoStringList(Arrays.asList("e", "l", "l"), new FindCommonCharacters_Solution().commonChars(new String[]{"bella", "label", "roller"}));
        Helper.matchTwoStringList(Arrays.asList("c","o"), new FindCommonCharacters_Solution().commonChars(new String[]{"cool","lock","cook"}));
        Helper.matchTwoStringList(Arrays.asList(), new FindCommonCharacters_Solution().commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
    }
}
