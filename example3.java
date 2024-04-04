import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "aabbccdefgh";
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        StringBuilder nonRepeatingChars = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatingChars.append(entry.getKey()).append(", ");
            }
        }

        if (nonRepeatingChars.length() > 0) {
            nonRepeatingChars.delete(nonRepeatingChars.length() - 2, nonRepeatingChars.length());
        }

        System.out.println("Non-repeating characters in '" + str + "': " + nonRepeatingChars.toString());
    }
}
