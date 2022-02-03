package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 12:54 PM.
 */
public class ConvertSortedArrayToBinarySearchTree_Solution_Test {
    @Test
    void testAll() {
        TreeNode treeNode = new ConvertSortedArrayToBinarySearchTree_Solution().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        List<Integer> result = new ArrayList<>();
        Utils.traverseInOrder(treeNode, result);

    }

}
