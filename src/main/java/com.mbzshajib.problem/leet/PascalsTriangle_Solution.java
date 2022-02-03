package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 3:26 AM.
 */
public class PascalsTriangle_Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        sol.add(firstRow);

        for(int i =1 ;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> preRow=sol.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(preRow.get(j)+preRow.get(j-1));
            row.add(1);
            sol.add(row);

        }
        return sol;
    }
}
