package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/27/2022 at 5:28 PM.
 */
public class HouseRobber_Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public int rob(int[] nums) {
        return recursion(nums.length - 1, nums);
    }

    private int recursion(int index, int[] weights) {
        if (index == 0) map.put(0, weights[0]);
        if (index == 1) map.put(1, Math.max(weights[0], weights[1]));
        if (!map.containsKey(index))
            map.put(index, Math.max(
                    recursion(index - 1, weights),
                    recursion(index - 2, weights) + weights[index]
            ));
        return map.get(index);
    }
}
