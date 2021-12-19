import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 12:33 PM.
 */
public class RomanToInteger_Solution {
    public static void main(String[] args) {
//        System.out.println(romanToInt("IV"));
//        System.out.println(romanToInt("IX"));
//        System.out.println(romanToInt("XL"));
//        System.out.println(romanToInt("XC"));
//        System.out.println(romanToInt("CD"));
//        System.out.println(romanToInt("CM"));
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String input) {
        Map<String, Integer> priorityDictionary = new HashMap<>();
        Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("I", 1);
        dictionary.put("V", 5);
        dictionary.put("X", 10);
        dictionary.put("L", 50);
        dictionary.put("C", 100);
        dictionary.put("D", 500);
        dictionary.put("M", 1000);

        priorityDictionary.put("IV", 4);
        priorityDictionary.put("IX", 9);
        priorityDictionary.put("XL", 40);
        priorityDictionary.put("XC", 90);
        priorityDictionary.put("CD", 400);
        priorityDictionary.put("CM", 900);

        int result = 0;
        if (input == null || input == "") return result;
        if (input.length() == 2 && priorityDictionary.containsKey(input)) return priorityDictionary.get(input);
        for (int i = input.length() - 1; i >= 0; i--) {
            if (i - 1 >= 0 && priorityDictionary.get(input.substring(i - 1, i + 1)) != null) {
                Integer value = priorityDictionary.get(input.substring(i - 1, i + 1));
                result = result + value;
                i--;
            } else result = result + dictionary.get(input.charAt(i) + "");
            ;
        }
        return result;
    }
}
