import java.util.Arrays;

public class fibonacci2 {
    public static void main(String[] args) {
        int num = 7;
        long [] cache = new long[num+1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;

        System.out.println(fib(num, cache));
    }

    private static long fib(int a, long [] cache) {
        if (cache[a] > -1) {
            return cache[a];
        }

        cache[a] = fib(a-1, cache) + fib(a-2, cache);
        return cache[a];
    }
}
