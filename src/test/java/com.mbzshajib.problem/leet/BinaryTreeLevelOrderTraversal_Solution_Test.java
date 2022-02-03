package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 1:27 PM.
 */
public class BinaryTreeLevelOrderTraversal_Solution_Test {
    @Test
    void testAll() {
        Helper.print(new BinaryTreeLevelOrderTraversal_Solution().levelOrder(Utils.prepareTree(new Integer[]{3,9,20,null,null,15,7})));
        Helper.print(new BinaryTreeLevelOrderTraversal_Solution().levelOrder(Utils.prepareTree(new Integer[]{1})));
        Helper.print(new BinaryTreeLevelOrderTraversal_Solution().levelOrder(Utils.prepareTree(new Integer[]{})));
    }
}
