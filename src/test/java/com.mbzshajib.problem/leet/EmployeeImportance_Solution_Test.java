package com.mbzshajib.problem.leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 1:58 PM.
 */

public class EmployeeImportance_Solution_Test {
    @Test
    void testAll() {
        Assertions.assertEquals(11, new EmployeeImportance_Solution().getImportance(Arrays.asList(new Employee[]{
                new Employee(1, 5, Arrays.asList(2, 3)),
                new Employee(2, 3, Arrays.asList()),
                new Employee(3, 3, Arrays.asList())
        }), 1));
        Assertions.assertEquals(3, new EmployeeImportance_Solution().getImportance(Arrays.asList(new Employee[]{
                new Employee(1, 5, Arrays.asList(2, 3)),
                new Employee(2, 3, Arrays.asList()),
                new Employee(3, 3, Arrays.asList())
        }), 2));
        Assertions.assertEquals(3, new EmployeeImportance_Solution().getImportance(Arrays.asList(new Employee[]{
                new Employee(1, 5, Arrays.asList(2, 3)),
                new Employee(2, 3, Arrays.asList()),
                new Employee(3, 3, Arrays.asList())
        }), 3));

        Assertions.assertEquals(-3, new EmployeeImportance_Solution().getImportance(Arrays.asList(new Employee[]{
                new Employee(1, 2, Arrays.asList(5)),
                new Employee(5, -3, Arrays.asList())
        }), 5));
        Assertions.assertEquals(-1, new EmployeeImportance_Solution().getImportance(Arrays.asList(new Employee[]{
                new Employee(1, 2, Arrays.asList(5)),
                new Employee(5, -3, Arrays.asList())
        }), 1));

    }
}
