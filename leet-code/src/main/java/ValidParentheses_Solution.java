import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 1:40 PM.
 */
public class ValidParentheses_Solution {
    public static void main(String[] args) {
//        System.out.println(isValid("(Shajiv"));
        System.out.println(isValid("{[]}kamal[{shajib}])"));
    }

    public static boolean isValid(String input) {
        boolean result = true;
        if (input == null || input.length() <= 1) return false;
        Map<Character, Character> dictionary = new HashMap<>();
        Map<Character, Character> reverseDictionary = new HashMap<>();
        dictionary.put('(', ')');
        dictionary.put('{', '}');
        dictionary.put('[', ']');
        reverseDictionary.put(')', '(');
        reverseDictionary.put('}', '{');
        reverseDictionary.put(']', '[');
        char[] inputChars = input.toCharArray();
        char[] stack = new char[inputChars.length];
        int stackIndex = 0;
        for (int i = 0; i < inputChars.length; i++) {
            Character currentChar = dictionary.get(inputChars[i]);
            Character reverseChar = reverseDictionary.get(inputChars[i]);
            if (currentChar != null) {
                stack[stackIndex++] = inputChars[i];
            } else if (reverseChar != null) {
                if(stackIndex==0){
                    result = false;
                    break;
                }
                if (stack[--stackIndex] != reverseChar) {
                    result = false;
                    break;
                }
            }
        }
        return result && stackIndex == 0;
    }
}
