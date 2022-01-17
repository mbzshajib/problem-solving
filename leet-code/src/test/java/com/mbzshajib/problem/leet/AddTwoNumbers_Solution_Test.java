package com.mbzshajib.problem.leet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/13/2022 at 5:39 PM.
 */
@Suite
public class AddTwoNumbers_Solution_Test {
    @Test
    void testNull() {
        ListNode node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(null), Utils.prepareLinkList(null));
        Assert.assertNull(node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(null), Utils.prepareLinkList(new Integer[]{2, 4, 5, 7, 8}));
        validateList(Utils.prepareLinkList(new Integer[]{2, 4, 5, 7, 8}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{1}), Utils.prepareLinkList(new Integer[]{9}));
        validateList(Utils.prepareLinkList(new Integer[]{0, 1}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{1, 0, 9}), Utils.prepareLinkList(new Integer[]{5}));
        validateList(Utils.prepareLinkList(new Integer[]{6, 0, 9}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9}), Utils.prepareLinkList(new Integer[]{1, 0, 9}));
        validateList(Utils.prepareLinkList(new Integer[]{0, 1, 9}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9, 9, 9}), Utils.prepareLinkList(new Integer[]{9, 9, 9}));
        validateList(Utils.prepareLinkList(new Integer[]{8, 9, 9, 1}), node);

        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{2, 4, 3}), Utils.prepareLinkList(new Integer[]{5, 6, 4}));
        validateList(Utils.prepareLinkList(new Integer[]{7, 0, 8}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{0}), Utils.prepareLinkList(new Integer[]{0}));
        validateList(Utils.prepareLinkList(new Integer[]{0}), node);
        node = new AddTwoNumbers_Solution().addTwoNumbers(Utils.prepareLinkList(new Integer[]{9, 9, 9, 9, 9, 9, 9}), Utils.prepareLinkList(new Integer[]{9, 9, 9, 9}));
        validateList(Utils.prepareLinkList(new Integer[]{8,9,9,9,0,0,0,1}), node);

    }

    void validateList(ListNode expected, ListNode result) {
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
}
