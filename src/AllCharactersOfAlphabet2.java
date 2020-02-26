public class AllCharactersOfAlphabet2 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(usesAllAlphabet(s));

        System.out.println(usesAllAlphabet("asdf"));
    }

    public static boolean usesAllAlphabet(String s) {

        boolean [] isUsed = new boolean [26];

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            isUsed[x] = true;
        }

        for (boolean b : isUsed) {
            if (!b) return false;
        }

        return true;
    }
}
