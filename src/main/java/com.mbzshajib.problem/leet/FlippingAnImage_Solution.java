package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 12:04 PM.
 */
public class FlippingAnImage_Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int end = image[row].length - 1;
            for (int column = 0; column < image[row].length; column++) {
                if (column <= end) {
                    int temp = image[row][column];
                    image[row][column] =1- image[row][end];
                    image[row][end] = 1-temp;
                    end--;
                }

            }
        }
        return image;
    }
}
