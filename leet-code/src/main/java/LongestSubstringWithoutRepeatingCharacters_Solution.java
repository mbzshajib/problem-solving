import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/9/21 at 9:58 AM.
 */
public class LongestSubstringWithoutRepeatingCharacters_Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("aw"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String input) {
        int result = 0;
        if (input == null || input.isEmpty()) return result;
        result = 1;
        char[] array = input.toCharArray();
        Map<Character, Integer> substring = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            char curr = array[i];
            Integer lastStrIndex = substring.put(curr, i);
            if (lastStrIndex != null) {
                if (result < (substring.size())) result = substring.size();
                substring.clear();
                substring.put(array[lastStrIndex+1], lastStrIndex+1);
                i = lastStrIndex+1;
            }
        }
        if (result < (substring.size())) result = substring.size();
        return result;
    }
}
