package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 1:04 PM.
 */
@Suite
public class AllPathsFromSourceToTarget_Solution_Test {
    @Test
    void testAll() {
        List<List<Integer>> lists = new AllPathsFromSourceToTarget_Solution().allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}});
        Helper.printListOfListOfInteger(lists);
        System.out.println();
        lists = new AllPathsFromSourceToTarget_Solution().allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}});
        Helper.printListOfListOfInteger(lists);
    }


}