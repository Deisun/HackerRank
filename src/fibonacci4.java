import java.util.Arrays;

public class fibonacci4 {
    public static void main(String[] args) {
        int num = 7;

        long [] cache = new long [num+1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;

        System.out.println(fibo(num, cache));
    }

    private static long fibo(int num, long[] cache) {
        if (cache[num] > -1) return cache[num];

        return fibo(num - 1, cache) + fibo(num - 2, cache);
    }
}
