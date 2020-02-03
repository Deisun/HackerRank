import java.util.HashSet;
import java.util.Set;

public class LengthLongestSubstring {

    public int LengthLongestSubstring(String text) {

        Set<Character> set = new HashSet<>();

        int start = 0;
        int end = 0;
        int max = 0;


        while (end < text.length()) {
            if (!set.contains(text.charAt(end))) {
                set.add(text.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(text.charAt(start));
                start++;
            }
        }

        return max;
    }
}
