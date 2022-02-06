package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/5/2022 at 5:59 PM.
 */
public class XOfAKindInADeckOfCards_Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) return false;
        Map<Integer, Integer> cardCountMap = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            int itemCount = cardCountMap.getOrDefault(deck[i], 0) + 1;
            cardCountMap.put(deck[i], itemCount);
        }
        int firstItemCount = cardCountMap.get(deck[0]);
        Iterator<Map.Entry<Integer, Integer>> iterator = cardCountMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> item = iterator.next();
            Integer itemCount = item.getValue();
            if (itemCount == firstItemCount) {
                continue;
            } else if (itemCount > firstItemCount) {
                if (itemCount % firstItemCount != 0) return false;
            } else {
                if (firstItemCount % itemCount != 0) return false;
            }
        }
        return true;
    }
}
