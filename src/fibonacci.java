import java.util.Arrays;

public class fibonacci {

    public static void main(String[] args) {
        int num = 7;

        long [] cache = new long[num + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;

        System.out.println(fib(num, cache));

    }

    private static long fib(int num, long [] cache) {
        if (cache[num] > -1) {
            return cache[num];
        }
        cache[num] = fib(num-1, cache) + fib(num-2, cache);
        return cache[num];

/*
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fib(num-1) + fib(num-2);
        }
*/

    }

}
