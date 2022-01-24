package com.mbzshajib.problem.leet;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/24/2022 at 2:43 PM.
 */
public class StringToIntegerAtoi_Solution {
    public int myAtoi(String s) {
        char[] input = s.toCharArray();
        List<Character> validInput = Arrays.asList(
                '0',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9',
                ' ',
                '+',
                '-'
        );
        boolean hasStarted = false;

        String stack = "";
        for (int i = 0; i < input.length; i++) {
            if (validInput.contains(input[i])) {
                if (hasStarted) {
                    if ('0' <= input[i] && input[i] <= '9') {
                        stack = stack + input[i];
                        hasStarted = true;
                    } else {
                        break;
                    }
                } else {
                    if (('0' <= input[i] && input[i] <= '9') || input[i] == '+' || input[i] == '-') {
                        stack = stack + input[i];
                        hasStarted = true;
                    }
                }
            } else break;
        }
        Boolean isPositive = null;
        long result = 0;
        input = stack.toCharArray();
        int i = 0;
        if(input.length==0)return 0;
        if(input[0]=='+'){
            isPositive = true;
            i =1;
        }
        if(input[0]=='-'){
            isPositive = false;
            i =1;
        }
        for (; i < input.length; i++) {
            result = result * 10 + (input[i] - 48);
            if(result>Integer.MAX_VALUE)
            if(isPositive==null ||isPositive)    return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;

        }
        if (isPositive == null || isPositive) return (int) result;
        else return -(int) result;
    }
}
