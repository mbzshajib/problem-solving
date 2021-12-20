package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
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

