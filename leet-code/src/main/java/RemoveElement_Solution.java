import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 12:47 AM.
 */
public class RemoveElement_Solution {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 1) {
            if (val == nums[0]) return 0;
            else return 1;
        }
        int result = 0;
        int position = 0;
        for (int counter = 0; counter < nums.length; counter++) {
            if (nums[counter] != val) {
                nums[position++] = nums[counter];
                result++;

            }
        }
        System.out.println(Arrays.toString(nums));
        return result;
    }
}
