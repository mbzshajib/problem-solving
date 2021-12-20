import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/6/21 at 5:25 PM.
 */
public class _3Sum_Solution {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<int[]> ints = Arrays.asList(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            List<Integer> integers = twoSum(Arrays.copyOfRange(nums, i + 1, nums.length - 1), Math.negateExact(nums[i]));
            System.out.println(integers);
            if (integers != null && !integers.isEmpty()) {
                integers.add(nums[i]);
                result.add(integers);
            }
        }
        return result;
    }

    public static List<Integer> twoSum(int[] nums, int target) {
        System.out.println("Target is "+target+" nums "+Arrays.toString(nums));
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int chk = (target - nums[i]);
            Integer integer = map.get(chk);
            if (integer == null || integer == i) {
                continue;
            } else {
                result.add(nums[i]);
                result.add(chk);
                return result;
            }

        }
        return result;
    }

}
