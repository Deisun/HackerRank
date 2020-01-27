public class RepeatedStrings {
    public static void main(String[] args) {
        String s = "aba";
        long n =  9;
        long count = 0;
        long factor = n/s.length();
        long remainder = n % s.length();

        for (char c : s.toCharArray()) {
            if (c == 'a')
                count++;
        }

        count = count * factor;

        for (int i = 0; i < remainder; i++) {
           if (s.charAt(i) == 'a')
               count++;
        }



        System.out.println(count);
    }
}
