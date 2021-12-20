/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/7/21 at 1:11 PM.
 */
public class ImplementStrstr_Solution {
    public static void main(String[] args) {
        System.out.println(strStrArray("Hello", "ll"));
        System.out.println(strStrArray("Hello", "H"));
        System.out.println(strStrArray("Hello", "lo"));
        System.out.println(strStrArray("Hello", "o"));
        System.out.println(strStrArray("", "a"));
    }

    public static int strStr(String haystack, String needle) {
        int result = 0;
        if ((haystack == null && haystack.isEmpty()) || (needle == null || needle.isEmpty())) return result;
        result = -1;
        if (haystack.isEmpty()) return result;
        for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
            boolean matched = true;
            for (int j = 0; j < needle.length() && i + j < haystack.length(); j++) {
                matched = matched && haystack.charAt(i + j) == needle.charAt(j);
                if (!matched) break;
            }
            if (matched) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int strStrArray(String haystack, String needle) {
        int result = 0;
        if ((haystack == null && haystack.isEmpty()) || (needle == null || needle.isEmpty())) return result;
        result = -1;
        if (haystack.isEmpty()) return result;
        char[] charHaystack = haystack.toCharArray();
        char[] charNeedle = needle.toCharArray();

        for (int i = 0; i < (charHaystack.length - charNeedle.length + 1); i++) {
            boolean matched = true;
            for (int j = 0,k=charNeedle.length; j < charNeedle.length && i + j < charHaystack.length; j++) {
                matched = matched && charHaystack[(i + j)] == charNeedle[(j)];
                if (!matched) break;
            }
            if (matched) {
                result = i;
                break;
            }
        }
        return result;
    }
}
