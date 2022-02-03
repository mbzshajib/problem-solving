package com.mbzshajib.problem.leet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/3/2022 at 1:58 PM.
 */
public class EmployeeImportance_Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        Map<Integer, Employee> mapping = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            mapping.put(employees.get(i).id, employees.get(i));
        }
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee.id == id) {
                targetEmployee = employee;
                break;
            }
        }
        Stack<Employee> stack = new Stack<>();
        Integer importance = 0;
        stack.push(targetEmployee);
        while (!stack.empty()) {
            Employee currEmployee = stack.pop();
            importance = importance + currEmployee.importance;
            for (Integer subOrdinateId : currEmployee.subordinates) {
                stack.push(mapping.get(subOrdinateId));
            }

        }

        return importance;
    }
}
