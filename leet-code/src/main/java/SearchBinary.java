/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 12/9/21 at 12:34 PM.
 */
public class SearchBinary {
    public static void main(String[] args) {
        System.out.println(searchBinary(new int[]{1, 2, 3, 4,100}, 100));
    }

    public static int searchBinary(int[] array, int number) {
        int result = -1;
        int beginIndex = 0, endIndex = array.length - 1;
        while (beginIndex <= endIndex) {
            int mid = (beginIndex + endIndex) / 2;
            if (array[mid] == number) return mid;
            if (array[mid] < number) beginIndex = mid+1;
            else endIndex = mid-1;
        }
        return result;
    }
}
