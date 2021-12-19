import java.util.Arrays;
import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/6/21 at 9:16 PM.
 */
public class BestTimeToBuyAndSellStock_Solution {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }


    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 2) return 0;
        int profit = 0;
        int counter = 1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > profit) profit = diff;
            }
        }        System.out.println(Arrays.toString(prices));

        return profit;

    }

    public static int maxProfitOld(int[] prices) {
        if (prices == null || prices.length <= 2) return 0;
        System.out.println(Arrays.toString(prices));
        int profit = 0;
        Stack<Integer> max = new Stack<>();
        Stack<Integer> min = new Stack<>();
        max.push(prices[0]);
        min.push(prices[0]);
        for (int i = 1; i<prices.length;i++){
            if(max.peek()<prices[i]){
                max.push(prices[i]);
            }
            if(min.peek()>prices[i]){
                min.push(prices[i]);
            }
        }

        return profit;

    }
}
