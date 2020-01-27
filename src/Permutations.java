import java.util.Arrays;
import java.util.HashMap;

public class Permutations {
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "aba";

        System.out.println(isPermutation(s1, s2));
    }

    private static boolean isPermutation(String s1, String s2) {
        String sortedS1 = sort(s1);
        String sortedS2 = sort(s2);

        return sortedS1.equals(sortedS2);

    }

    private static String sort(String s) {

        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
