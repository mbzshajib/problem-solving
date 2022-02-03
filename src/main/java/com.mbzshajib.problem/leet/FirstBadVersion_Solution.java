package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:12 AM.
 */
public class FirstBadVersion_Solution {
    private int badVersion;

    FirstBadVersion_Solution(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        long low = 1, high = n;
        while (low <= high) {
            int mid = (int) ((low + high) / 2);
            if (isBadVersion(mid)) high = mid - 1;
            else low = mid + 1;
        }
        return (int) low;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
