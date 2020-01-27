public class UniqueString2 {
    public static void main(String[] args) {
        String s = "abc";

        System.out.println(isUnique(s));
    }

    private static boolean isUnique(String s) {
        boolean [] charSet = new boolean[128];

        for (char c : s.toCharArray()) {

            if (charSet[c])
                return false;

            charSet[c] = true;
        }

        return true;
    }
}
