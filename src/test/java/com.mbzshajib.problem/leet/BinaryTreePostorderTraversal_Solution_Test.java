package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/10/2022 at 1:27 PM.
 */
public class BinaryTreePostorderTraversal_Solution_Test {
    @Test
    void case_01_null() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{null});
        List<Integer> integers = new BinaryTreePostorderTraversal_Solution().postorderTraversal(treeNode);
        Assertions.assertNotNull(integers);
        Assertions.assertTrue(integers.size() == 0);
    }

    @Test
    void case_Provided_01() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{1, null, 2, 3});
        List<Integer> result = new BinaryTreePostorderTraversal_Solution().postorderTraversal(treeNode);
        List<Integer> expected = Arrays.asList(new Integer[]{3,2,1});
        validate(result, expected);
    }

    @Test
    void case_Provided_02() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{});
        List<Integer> result = new BinaryTreePostorderTraversal_Solution().postorderTraversal(treeNode);
        List<Integer> expected = Arrays.asList(new Integer[]{});
        validate(result, expected);
    }

    @Test
    void case_Provided_03() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{2});
        List<Integer> result = new BinaryTreePostorderTraversal_Solution().postorderTraversal(treeNode);
        List<Integer> expected = Arrays.asList(new Integer[]{2});
        validate(result, expected);
    }

    @Test
    void case_Provided_04() {
        TreeNode treeNode = Utils.prepareTree(new Integer[]{1,2,3,4,5,6,7});
        List<Integer> result = new BinaryTreePostorderTraversal_Solution().postorderTraversal(treeNode);
        List<Integer> expected = Arrays.asList(new Integer[]{4,5,2,6,7,3,1});
        validate(result, expected);
    }


    private void validate(List<Integer> result, List<Integer> expected) {
        Assertions.assertEquals(result.size(), expected.size());
        IntStream.range(0, expected.size())
                .filter((counter) -> {
                    Assertions.assertEquals(expected.get(counter), result.get(counter));
                    return result.get(counter) == expected.get(counter);
                })
                .map(counter->result.get(counter))
                .forEach(System.out::println);
    }
}
