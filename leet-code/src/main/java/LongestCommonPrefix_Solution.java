/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/7/21 at 11:44 AM.
 */
public class LongestCommonPrefix_Solution {
    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
//        System.out.println(longestCommonPrefix(new String[]{"Shajib", "shajib", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"Shajib", "Shajib", "Shajib"}));
        System.out.println(longestCommonPrefix(new String[]{"Sha", "Shajib", "Shajib"}));
        System.out.println(longestCommonPrefix(new String[]{"Shajib", "Shajib", "Sha"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String baseString = strs[0];

        int maxMatched = 0;
        for (int index = 0; ; index++) {
            boolean maxLengthReached = false;
            boolean result = true;
            for (int i = 0; i < strs.length; i++) {
                result = true;
                if (strs[i].length() < index + 1) {
                    maxLengthReached = true;
                    break;
                }
                result = result && strs[i].charAt(index) == baseString.charAt(index);
                if (!result) break;
            }
            if (maxLengthReached || !result) {
                maxMatched = index;
                break;
            }

        }
        String result = baseString.substring(0, maxMatched);
        return result;
    }
}
