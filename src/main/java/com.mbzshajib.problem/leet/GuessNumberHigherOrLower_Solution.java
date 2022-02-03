package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/18/2022 at 12:40 AM.
 */
public class GuessNumberHigherOrLower_Solution {
    private int pick;

    public GuessNumberHigherOrLower_Solution(int guessedNumber) {
        this.pick = guessedNumber;
    }

    public int guessNumber(int n) {
        long low = 1, high = n;
        while (low <= high) {
            int mid = (int) ((low + high) / 2);
            int guessResult = guess(mid);
            if (guessResult == 0) return mid;
            if (guessResult == 1) low = mid + 1;
            if (guessResult == -1) high = mid - 1;
        }
        return (int)low;
    }

    private int guess(int num) {
        if (pick < num) return -1;
        else if (pick > num) return 1;
        else return 0;
    }
}
