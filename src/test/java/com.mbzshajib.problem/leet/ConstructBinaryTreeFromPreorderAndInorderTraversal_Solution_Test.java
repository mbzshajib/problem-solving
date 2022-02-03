package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 2:11 AM.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_Solution_Test {
    @Test
    void testAll() {
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(Utils.prepareTree(new Integer[]{3,9,20,null,null,15,7}), new ConstructBinaryTreeFromPreorderAndInorderTraversal_Solution().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
        Helper.validateTwoTreeSame_PreInPostOrderTravarsal(Utils.prepareTree(new Integer[]{-1}), new ConstructBinaryTreeFromPreorderAndInorderTraversal_Solution().buildTree(new int[]{-1}, new int[]{-1}));

    }
}
