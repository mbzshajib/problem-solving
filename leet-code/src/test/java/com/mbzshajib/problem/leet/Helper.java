package com.mbzshajib.problem.leet;

import org.junit.Assert;

import java.util.ArrayList;

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
}
