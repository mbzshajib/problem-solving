package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 4:54 PM.
 */
public class ZigzagConversion_Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1)return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i =0;i<Math.min(s.length(),numRows);i++)
            rows.add(new StringBuilder());
        int curRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

}
