package com.mbzshajib.problem.leet;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 1:08 AM.
 */
public class CapacityToShipPackagesWithinDDays_Solution {
    public int shipWithinDays(int[] weights, int days) {
        long min = 0;
        min = Arrays.stream(weights).asLongStream().reduce(min, (a, b) -> Math.max(a, b));
        long max = Arrays.stream(weights).sum();
        while (min < max) {
            int mid = (int) ((min + max) / 2);
            int sum = 0, calDays = 1;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    sum = 0;
                    calDays++;
                }
                sum += weight;
            }
            if (days < calDays) min = mid + 1;
            else max = mid;
        }
        return (int) min;
    }
}
