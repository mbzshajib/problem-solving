package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 12:37 AM.
 */
@Suite
public class PathSum_ii_Solution_Test {
    @Test
    void case_Provided_01() {
        List<List<Integer>> lists = new PathSum_ii_Solution().pathSum(Utils.prepareTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}), 22);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 4, 11, 2), Arrays.asList(5, 8, 4, 5));
        validate(expected, lists);
    }

    @Test
    void case_Provided_02() {
        List<List<Integer>> lists = new PathSum_ii_Solution().pathSum(Utils.prepareTree(new Integer[]{1, 2, 3}), 5);
        List<List<Integer>> expected = Arrays.asList();
        validate(expected, lists);
    }

    @Test
    void case_Provided_03() {
        List<List<Integer>> lists = new PathSum_ii_Solution().pathSum(Utils.prepareTree(new Integer[]{5}), 5);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(5));
        validate(expected, lists);
    }

    @Test
    void case_Provided_04() {
        List<List<Integer>> lists = new PathSum_ii_Solution().pathSum(Utils.prepareTree(new Integer[]{-2, null, -3}), -5);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -3));
        validate(expected, lists);
    }


    private void validate(List<List<Integer>> expected, List<List<Integer>> result) {
        Assert.assertEquals(expected.size(), result.size());
        IntStream.range(0, expected.size())
                .filter(count -> {
                    Assert.assertEquals(expected.get(count).size(), result.get(count).size());
                    return true;
                })
                .filter(count -> {
                    IntStream.range(0, expected.get(count).size())
                            .filter(innerCount -> {
                                Assert.assertEquals(expected.get(count).get(innerCount), result.get(count).get(innerCount));
                                return true;
                            })
                            .mapToObj(innerCount -> Integer.valueOf(expected.get(count).get(innerCount)))
                            .collect(Collectors.toList());
                    return true;
                })
                .mapToObj(count -> expected.get(count))
                .forEach(System.out::println);
    }
}
