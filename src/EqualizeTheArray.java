import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    public static void main(String[] args) {
       int [] arr = {3, 3, 2, 1, 3};

        System.out.println(equalize(arr));
    }

    private static int equalize(int [] arr) {
        int max = 1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);

                if (max < map.get(num)) {
                    max = map.get(num);
                }
            }
        }

        return arr.length - max;
    }
}
