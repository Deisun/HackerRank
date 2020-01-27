import java.util.HashMap;
import java.util.Map;

public class Permutations2 {
    public static void main(String[] args) {
        String s1 = "bab";
        String s2 = "bab";

        System.out.println(isPermutation(s1, s2));

    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        for (char c : s1.toCharArray()) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                map2.put(c, map2.get(c) + 1);
            }
        }

        return (map1.equals(map2));

    }

}
