package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 3:37 PM.
 */
@Suite
public class BinaryTreePaths_Solution_Test {
    @Test
    void inputTest_001() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{1, 2, 3, null, 5});
        List<String> result = new BinaryTreePaths_Solution().binaryTreePaths(treeNode);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        validate(expected, result);
    }

    @Test
    void inputTest_002() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{2});
        List<String> result = new BinaryTreePaths_Solution().binaryTreePaths(treeNode);
        List<String> expected = Arrays.asList("2");
        validate(expected, result);
    }

    @Test
    void case003() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        List<String> result = new BinaryTreePaths_Solution().binaryTreePaths(treeNode);
        List<String> expected = Arrays.asList("5->4->11->7", "5->4->11->2", "5->8->13", "5->8->4->5", "5->8->4->1");
        validate(expected, result);
    }

    private void validate(List<String> expected, List<String> result) {
        Assert.assertNotNull(result);
//        Assert.assertEquals(expected.size(), result.size());
        IntStream.range(0, expected.size())
                .filter(counter -> {
                    Assert.assertEquals(expected.get(counter), result.get(counter));
                    return expected.get(counter).equals(result.get(counter));
                }).mapToObj(counter -> result.get(counter))
                .forEach(System.out::println);
    }

}

