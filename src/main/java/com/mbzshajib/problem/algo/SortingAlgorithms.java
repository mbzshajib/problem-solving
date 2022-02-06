package com.mbzshajib.problem.algo;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/6/2022 at 11:10 AM.
 */
public class SortingAlgorithms {
    public static int[] bubbleSort(int[] input) {
        return input;
    }

    public static int[] quickSort(int[] input) {
        return input;
    }

    public static int[] selectionSort(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < input.length; j++) {
                min = Math.min(min, input[i]);
            }
            result[i] = min;
        }
        return result;
    }

    public static int[] selectionSortConstantMemory(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < input.length; j++) {
                min = Math.min(min, input[i]);
            }
            input[i] = input[i] ^ min;
            min = input[i] ^ min;
            input[i] = input[i] ^ min;
        }
        return input;
    }

    public static int[] insertionSort(int[] input) {
        return input;
    }

    public static int[] mergeSort(int[] input) {
        return input;
    }
}
