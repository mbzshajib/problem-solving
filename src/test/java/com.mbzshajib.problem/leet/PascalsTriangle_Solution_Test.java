package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Test;


/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 3:29 AM.
 */

public class PascalsTriangle_Solution_Test {
    @Test
    void main(){
        Helper.print(new PascalsTriangle_Solution().generate(1));
        Helper.print(new PascalsTriangle_Solution().generate(10));
        Helper.print(new PascalsTriangle_Solution().generate(15));
    }
}
