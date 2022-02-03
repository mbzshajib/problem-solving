package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 11:07 AM.
 */
public class KeysAndRooms_Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> lockedRooms = new HashSet<>();
        for (int i = 1; i < rooms.size(); i++) {
            lockedRooms.add(i);

        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            Integer currRoom = stack.pop();
            if (lockedRooms.contains(currRoom)) lockedRooms.remove(currRoom);
            List<Integer> keys = rooms.get(currRoom);
            for (Integer key : keys) {
                if (lockedRooms.contains(key)) {
                    stack.add(key);
                }
            }
        }
        return lockedRooms.isEmpty();
    }
}
