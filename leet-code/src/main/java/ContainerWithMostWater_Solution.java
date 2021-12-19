/**
 * @author: Zaman Shajib
 * @email: md.shajib@bKash.com
 * Created on 12/7/21 at 12:21 AM.
 */
public class ContainerWithMostWater_Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            if (height[i] > height[j]) j--;
            else i++;
        }
        return area;
    }
}
