package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 3:52 PM.
 */
public class ANumberAfterADoubleReversal_Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        return num % 10 != 0;
    }
}
