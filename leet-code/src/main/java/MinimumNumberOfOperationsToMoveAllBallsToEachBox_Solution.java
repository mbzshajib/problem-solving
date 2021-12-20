import java.util.*;
import java.util.stream.Stream;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox_Solution {
    public static void main(String[] args) {
        Arrays.stream(minOperations("10001")).forEach(System.out::println);
        Arrays.stream(minOperations("11001")).forEach(System.out::println);
        Arrays.stream(minOperations("001011")).forEach(System.out::println);
//        Arrays.stream(minOperations("10011")).forEach(System.out::println);
    }

    public static int[] minOperations(String boxes) {
        Map<Integer, Integer> dataset = new HashMap<>();
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                dataset.put(i, Integer.parseInt("" + boxes.charAt(i)));
            }
        }
        Stream.of(dataset)
                .forEach(System.out::println);
        Set<Map.Entry<Integer, Integer>> entries = dataset.entrySet();
        for (int i = 0; i < result.length; i++) {
            Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
            int cost = 0;
            while (iterator.hasNext()) {
                Integer key = iterator.next().getKey();
                cost = cost + Math.abs(i - key);
            }
            result[i] = cost;
        }
        return result;
    }
}
