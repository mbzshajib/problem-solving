package com.mbzshajib.problem.leet;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/6/21 at 9:16 PM.
 */
public class BestTimeToBuyAndSellStock_Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        if (prices.length == 2) {
            if (prices[0] > prices[1]) return 0;
            else return prices[1] - prices[0];
        }
        int result = 0;
        int[] calculated = new int[prices.length];
        calculated[0] = 0;
        result = Math.max(result, prices[1] - prices[0]);
        for (int i = 1; i < calculated.length; i++) {
            calculated[i] = Math.max(prices[i] - prices[i - 1] + calculated[i - 1], 0);
            result = Math.max(result, calculated[i]);
        }
        return result;

    }
}
