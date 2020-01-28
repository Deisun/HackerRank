import java.util.Arrays;
import java.util.HashSet;

public class intersectionTwoLists3 {
    public static void main(String[] args) {

        int [] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums2) {
            if (set1.contains(i))
                set2.add(i);
        }


        int [] result = new int[set2.size()];

        int i = 0;
        for (int r : set2) {
            result[i] = r;
            i++;
        }


        return result;
    }
}
