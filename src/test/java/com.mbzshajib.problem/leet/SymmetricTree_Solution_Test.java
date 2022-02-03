package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:55 PM.
 */
public class SymmetricTree_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{})));
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1})));
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2})));
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, 9, null, null, 9})));
        Assertions.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, null, 9, 9, null})));

        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, null})));
        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3})));
        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, 4})));
        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, null, 3})));
        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, null, 3, null, 3})));
        Assertions.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, 9, null, 9, null})));
    }
}
