import java.util.HashMap;
import java.util.HashSet;

public class SumOfTwo {

    public static void main(String[] args) {
        int [] array1 = {3, 6, 0, 1};
        int [] array2 = {10, 15, 30, 12};
        int target = 21;

        System.out.println(sumOfTwo(array1, array2, target));
    }

    public static boolean sumOfTwo(int [] array1, int [] array2, int target) {
        HashSet<Integer> complements = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            int complement = target - array1[i];
            complements.add(complement);
        }

        for (int i = 0; i < array2.length; i++) {
            if (complements.contains(array2[i])) return true;
        }

        return false;
    }
}
