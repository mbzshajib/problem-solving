package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 5:55 PM.
 */
@Suite
public class SymmetricTree_Solution_Test {
    @Test
    void testAll() {
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{})));
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1})));
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2})));
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, 9, null, null, 9})));
        Assert.assertTrue(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, null, 9, 9, null})));

        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, null})));
        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3})));
        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, 4})));
        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, null, 3})));
        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, null, 3, null, 3})));
        Assert.assertFalse(new SymmetricTree_Solution().isSymmetric(Utils.prepareTree(new Integer[]{1, 2, 2, 3, null, null, 3, 9, null, 9, null})));
    }
}
