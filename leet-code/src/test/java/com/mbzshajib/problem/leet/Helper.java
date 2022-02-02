package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/11/2022 at 10:58 AM.
 */
public class Helper {
    public static void validateTwoTreeSame_PreInPostOrderTravarsal(TreeNode expected, TreeNode result) {
        ArrayList<Integer> expectedList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        Utils.traversePreOrder(expected, expectedList);
        Utils.traversePreOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        expectedList = new ArrayList<>();
        resultList = new ArrayList<>();
        Utils.traverseInOrder(expected, expectedList);
        Utils.traverseInOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        expectedList = new ArrayList<>();
        resultList = new ArrayList<>();
        Utils.traversePostOrder(expected, expectedList);
        Utils.traversePostOrder(result, resultList);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());
    }

    public static void validateSameList(ListNode expected, ListNode result) {
        int expectedLength = 0, resultLength = 0;
        ListNode expectedTmp = expected, resultTmp = result;
        while (expectedTmp != null) {
            expectedLength++;
            expectedTmp = expectedTmp.next;
        }
        int expectedData[] = new int[expectedLength];
        for (int i = 0; i < expectedLength; i++) {
            expectedData[i] = expected.val;
            expected = expected.next;
        }
        while (resultTmp != null) {
            resultLength++;
            resultTmp = resultTmp.next;
        }
        int resultData[] = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            resultData[i] = result.val;
            result = result.next;
        }
        Assert.assertEquals(expectedLength, resultLength
        );
        Assert.assertArrayEquals(expectedData, resultData);

    }

    public static void matchTwoStringList(List<String> expected, List<String> result) {
        Assertions.assertEquals(expected.size(), result.size());
        Collections.sort(expected);
        Collections.sort(result);
        IntStream.range(0, expected.size())
                .filter(index -> {
                    Assertions.assertEquals(expected.get(index), result.get(index));
                    return true;
                }).forEach(System.out::println);
    }

    public static void matchTwoIntegerList(List<Integer> expected, List<Integer> result) {
        Assertions.assertEquals(expected.size(), result.size());
        Collections.sort(expected);
        Collections.sort(result);
        IntStream.range(0, expected.size())
                .filter(index -> {
                    Assertions.assertEquals(expected.get(index), result.get(index));
                    return true;
                }).forEach(System.out::println);
    }

    public static void print(List<List<Integer>> result) {
        result.stream()
                .filter(data -> {
                    data.stream().forEach(System.out::print);
                    return true;
                }).forEach(data -> {
                    System.out.println();
                });
    }

    public static void check2DMatrix(int[][] expected, int[][] result) {
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++)
                Assertions.assertEquals(expected[i][j], result[i][j]);
        }
    }

    public static void printListOfListOfInteger(List<List<Integer>> lists) {
        lists.stream()
                .forEach(list -> {
                            System.out.println(list.stream().map(integer -> integer.toString()).collect(Collectors.joining(",")));
                        }
                );
    }
}
