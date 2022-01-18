package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:28 PM.
 */
public class SingleNumberII_Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer fromMap = map.get(num);
            if (fromMap == null) map.put(num, 1);
            else if (fromMap < 2) map.put(num, fromMap + 1);
            else map.remove(num);
        }
        return map.entrySet().iterator().next().getKey();
    }
}
