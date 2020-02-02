import java.util.Arrays;

public class lexigraphicalSort {
    public static void main(String[] args) {


        String [] words = {"ABCDEF", "AA", "BEF", "A", "AABB"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    //swap the words
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(words));
    }
}
