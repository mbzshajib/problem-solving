import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/9/21 at 10:27 AM.
 */
public class IntegerToRoman_Solution {
    public static void main(String[] args) {
//        System.out.println(intToRoman(100));
//        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(20));
    }

    public static String intToRoman(int num) {
        String[] dictionary = new String[]{
                "I", "IV","V","IX", "X","XL", "L","XC", "C","CD", "D","CM", "M"
        };
        int[] values = new int[]{
                1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
        };
        StringBuilder builder = new StringBuilder();
        while (num != 0) {
            for (int i = values.length - 1; i >= 0; i--) {
                if (num / values[i] != 0) {
                    builder.append(dictionary[i]);
                    num = num - values[i];
                    break;
                }
            }
        }
        return builder.toString();
    }

    public static String intToRoman_OLD(int num) {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(1, "I");
        dictionary.put(5, "V");
        dictionary.put(10, "X");
        dictionary.put(50, "L");
        dictionary.put(100, "C");
        dictionary.put(500, "D");
        dictionary.put(1000, "M");

        dictionary.put(4, "IV");
        dictionary.put(9, "IX");
        dictionary.put(40, "XL");
        dictionary.put(90, "XC");
        dictionary.put(400, "CD");
        dictionary.put(900, "CM");

        int[] values = new int[]{
                1, 4, 5, 9,
                10, 40, 50, 90,
                100, 400, 500, 900, 1000,
        };
        StringBuilder builder = new StringBuilder();
        String result = "";
        result = dictionary.get(num);
        if (result != null) return result;
        while (num != 0) {
            for (int i = values.length - 1; i >= 0; i--) {
                if (num / values[i] != 0) {
                    builder.append(dictionary.get(values[i]));
                    num = num - values[i];
                    break;
                }
            }
        }
        return builder.toString();
    }
}
