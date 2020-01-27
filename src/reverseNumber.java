public class reverseNumber {
    public static void main(String[] args) {

        int num = 24;

        System.out.println(reverse(num));
    }

    private static int reverse(int n) {
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        return reverse;
    }
}
