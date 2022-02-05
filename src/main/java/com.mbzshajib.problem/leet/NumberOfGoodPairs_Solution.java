package com.mbzshajib.problem.leet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs_Solution {
        public int numIdenticalPairs(int[] nums) {
            int result = 0;
            Map<Integer, Integer> numCountMap = new HashMap<>();
            for (int n : nums) {
                numCountMap.put(n, numCountMap.getOrDefault(n, 0) + 1);
            }
            for (Integer value:numCountMap.values()){
                if(value>1) result = result+(value)*(value-1)/2;
            }
            return result;
        }
}
