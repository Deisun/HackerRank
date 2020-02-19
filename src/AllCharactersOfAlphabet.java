public class AllCharactersOfAlphabet {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(usesAllAlphabet(s));

        String t = "abc";
        System.out.println(usesAllAlphabet(t));
    }

    public static boolean usesAllAlphabet(String s) {

        boolean [] alphabet = new boolean [26];


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = c - 'a';
            alphabet[x] = true;
        }

        for (boolean b : alphabet) {
            if (!b) return false;
        }

        return true;
    }
}
