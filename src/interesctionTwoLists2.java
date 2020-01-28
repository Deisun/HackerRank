import java.util.Arrays;
import java.util.HashSet;

public class interesctionTwoLists2 {
    public static void main(String[] args) {

        int [] nums1 = {2, 4, 6};
        int [] nums2 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int [] intersection(int [] nums1, int [] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums2) {
            if (set1.contains(i))
            set2.add(i);
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }

        return result;
    }
}
