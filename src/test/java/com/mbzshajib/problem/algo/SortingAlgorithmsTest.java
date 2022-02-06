package com.mbzshajib.problem.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/6/2022 at 11:24 AM.
 */
public class SortingAlgorithmsTest {
    private static final int[][][] TEST_DATA = new int[][][]
            {
                    //Sorted
                    //Positive
                    {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}},
                    //negetive
                    {{-5, -4, -3, -2, -1}, {-5, -4, -3, -2, -1}},
                    //includes 0
                    {{-1, -2, 0, 1, 2}, {-1, -2, 0, 1, 2}},
                    {{0, 1, 2, 3, 4, 5}, {0, 1, 2, 3, 4, 5}},
                    {{-5, -4, -3, -2, -1, 0}, {-5, -4, -3, -2, -1, 0}},

                    //Reverse Sorted
                    //Positive
                    {{6, 5, 4, 3, 2, 1}, {1, 2, 3, 4, 5, 6}},
                    //negetive
                    {{-1, -2, -3, -4, -5}, {-5, -4, -3, -2, -1}},
                    //includes 0
                    {{2, 1, 0, 0, -1, -2}, {-1, -2, 0, 1, 2}},
                    {{5, 4, 3, 2, 1}, {0, 1, 2, 3, 4, 5}},
                    {{0, -1, -2, -3, -4, -5}, {-5, -4, -3, -2, -1, 0}},


            };

    @Test
    void testSelectionSorts() {
        for (int i = 0; i < TEST_DATA.length; i++) {
            Assertions.assertArrayEquals(TEST_DATA[i][1], SortingAlgorithms.selectionSort(TEST_DATA[i][0]));
        }
    }
}
