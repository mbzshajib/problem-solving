package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones_Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        int result = 0;
        for(Character jewel:jewels.toCharArray()){
            result = result+map.getOrDefault(jewel,0);
        }
        return result;
    }
}
