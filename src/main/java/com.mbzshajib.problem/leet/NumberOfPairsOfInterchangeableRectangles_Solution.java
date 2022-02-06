package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfPairsOfInterchangeableRectangles_Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long result = 0;
        List<Double> ratioList = new ArrayList<>();
        for (int[] rec : rectangles) {
            ratioList.add((double) rec[1] / (double) rec[0]);
        }
        Map<Double, Long> ratioCountMap = new HashMap<>();
        for (double ratio : ratioList) {
            ratioCountMap.put(ratio, ratioCountMap.getOrDefault(ratio, 0L) + 1L);

        }
        for (Long value : ratioCountMap.values()) {
            result = result + (value) * (value - 1) / 2;
        }
        return result;
    }
}
