import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 2:07 PM.
 */
public class AddBinary_Solution {
    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int[] resultArray = new int[Math.max(a.length(), b.length()) + 1];
        Arrays.fill(resultArray, (byte) '0');
        byte[] numA = a.getBytes();
        byte[] numB = b.getBytes();
        int lenDifA = resultArray.length - numA.length;
        int lenDifB = resultArray.length - numB.length;
        int carry = 0;
        for (int i = resultArray.length - 1; i >= 0; i--) {
            int intA = 0;
            int intB = 0;
            if (i - lenDifA >= 0) intA = (numA[i - lenDifA] - 48);
            if (i - lenDifB >= 0) intB = (numB[i - lenDifB] - 48);
            int tmp = 0;
            tmp = (carry + intA + intB);
            carry = ((tmp / 2));
            result.append((char) ((tmp % 2) + 48));
        }
        if (carry == 49) resultArray[0] = 49;
        System.out.println(Arrays.toString(resultArray));
        String res = result.reverse().toString();
        if (res.charAt(0) == '0') res = res.substring(1);
        return res;
    }
}
