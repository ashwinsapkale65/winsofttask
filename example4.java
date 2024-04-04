import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
