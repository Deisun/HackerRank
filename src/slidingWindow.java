import java.util.HashSet;
import java.util.Set;

public class slidingWindow {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        Set<Character> set = new HashSet<>();

        int answer = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                answer = Math.max(answer, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return answer;
    }
}
