package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:21 PM.
 */
public class SingleNumber_Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer put = map.put(num, num);
            if (put != null) map.remove(num);
        }
        return map.entrySet().iterator().next().getKey();
    }
}
