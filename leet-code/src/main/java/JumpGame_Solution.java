import java.util.Arrays;

/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 10:14 AM.
 */
public class JumpGame_Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{2, 0}));
        System.out.println(canJump(new int[]{2, 5, 0, 0}));
    }

    public static boolean canJumpOld(int[] nums) {
        Boolean answer = false;
        int position = 0;
        int lastPosition = nums.length - 1;
        for (int num : nums) {
            if (position == lastPosition) return true;
            if (position > lastPosition) return true;
            if (nums[position] == 0) return false;
            position = position + nums[position];
        }
        System.out.println(Arrays.toString(nums));
        return answer;
    }

    //            3, 2, 1, 0, 4
//            2,3,1,1,4
//            2,0
//            2,5,0,0
    public static boolean canJump(int[] nums) {
        boolean index[] = new boolean[nums.length];
        index[nums.length - 1] = true;
        for (int position = nums.length - 1; position >= 0; position--) {
            for (int i = 0; i <= nums[position]; i++) {
                if (position + i >= nums.length - 1 || index[position + i] == true) {
                    index[position] = true;
                    break;
                }
            }
        }
        return index[0];
    }

}
