import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 15, 12, 6, 20, 1 };
        int[] ranks = new int[arr.length];

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ranks[i] = rankMap.get(arr[i]);
        }

        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("Output array: " + Arrays.toString(ranks));
    }
}
