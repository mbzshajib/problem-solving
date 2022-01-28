package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 2:05 AM.
 */
public class ExcelSheetColumnTitle_Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber != 0) {
            int lsb = (columnNumber - 1) % 26;
            result.append(Character.valueOf((char) (65 + lsb)));
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }
}
