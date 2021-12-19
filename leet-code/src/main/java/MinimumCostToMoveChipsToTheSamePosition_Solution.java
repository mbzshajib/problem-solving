import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/6/21 at 3:58 PM.
 */
public class MinimumCostToMoveChipsToTheSamePosition_Solution {
    public static void main(String[] args) {
        System.out.println((minCostToMoveChips(new int[]{1,2,3})));
    }

    public static int minCostToMoveChips(int[] position) {
        int result = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int iterate:position){
            if(iterate%2==1){
                oddSum ++;
            }else {
                evenSum++;
            }
        }
        result = Integer.min(oddSum, evenSum);

        return result;
    }
}

