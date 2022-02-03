package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 1:52 AM.
 */
public class ThousandSeparator_Solution {
    public String thousandSeparator(int n) {
        if(n==0)return "0";
        StringBuilder builder = new StringBuilder();
        int position = 0;
        while (n != 0) {
            int lsd = n % 10;
            n = n / 10;
            builder.append(lsd);
            position++;
            if (position % 3 == 0 && n != 0) builder.append('.');
        }
        return builder.reverse().toString();
    }
}
