public class reverseString {
    public static void main(String[] args) {
        String s = "abc";

        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {

        String reverse = "";


        for (int i = s.length()-1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }


        return reverse;
    }
}
