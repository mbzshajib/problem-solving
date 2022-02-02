package com.mbzshajib.problem.leet;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 8:53 PM.
 */
public class WaterAndJugProblem_Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity == targetCapacity) return true;
        if (jug1Capacity + jug2Capacity < targetCapacity) return false;
        if (jug1Capacity % 2 == 0 && jug2Capacity % 2 == 0 && targetCapacity % 2 != 0) return false;
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new TreeSet<>();

        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currJug1 = curr[0];
            int currJug2 = curr[1];
            if (currJug1 + currJug2 == targetCapacity)
                return true;

            visited.add(currJug1 + "," + currJug2);

            int newJug1, newJug2;
            //Jug 1->2 jug2cap - jug2
            newJug1 = currJug1 - Math.min(currJug1, jug2Capacity - currJug2);
            newJug2 = currJug2 + Math.min(currJug1, jug2Capacity - currJug2);
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});
            //jug 2->1
            newJug1 = currJug1 + Math.min(currJug2, jug1Capacity - currJug1);
            newJug2 = currJug2 - Math.min(currJug2, jug1Capacity - currJug1);
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});


            newJug1 = 0;
            newJug2 = currJug2;
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});

            newJug1 = currJug1;
            newJug2 = 0;
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});

            newJug1 = jug1Capacity;
            newJug2 = currJug2;
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});
            newJug1 = currJug1;
            newJug2 = jug2Capacity;
            if (!visited.contains(newJug1 + "," + newJug2)) queue.add(new int[]{newJug1, newJug2});


        }
        return false;
    }
}
