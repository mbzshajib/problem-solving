/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/15/21 at 12:59 AM.
 */
public class ValidPerfectSquare_Solution {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1023));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long start = 1;
        long end = num / 2;
        while (start <= end) {
            long mid = (start + end) / 2;
            long midsqr = mid * mid;
            if (midsqr == num) return true;
            else if (midsqr > num) end = mid - 1;
            else if (midsqr < num) start = mid + 1;
        }
        return false;
    }
}
