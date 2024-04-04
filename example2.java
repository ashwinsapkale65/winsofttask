import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            if (lastIndex.containsKey(s.charAt(right)) && lastIndex.get(s.charAt(right)) >= left) {
                left = lastIndex.get(s.charAt(right)) + 1;
            }

            lastIndex.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Length of longest substring in '" + s1 + "': " + lengthOfLongestSubstring(s1));
        System.out.println("Length of longest substring in '" + s2 + "': " + lengthOfLongestSubstring(s2));
        System.out.println("Length of longest substring in '" + s3 + "': " + lengthOfLongestSubstring(s3));
    }
}
