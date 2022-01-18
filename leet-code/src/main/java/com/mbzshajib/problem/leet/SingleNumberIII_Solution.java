package com.mbzshajib.problem.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 6:37 PM.
 */
public class SingleNumberIII_Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer fromMap = map.get(num);
            if (fromMap == null) map.put(num, num);
            else map.remove(fromMap);
        }
        int[] result = new int[2];
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        result[0] = iterator.next().getKey();
        result[1] = iterator.next().getKey();
        return result;
    }
}
