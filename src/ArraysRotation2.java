import java.util.Arrays;

public class ArraysRotation2 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};

        System.out.println(Arrays.toString(rotateArray(array1, 4)));
    }

    private static int [] rotateArray(int [] array, int n){
       int [] rotatedArray = new int [array.length];

       int j = 0;
       for (int i = n; i < array.length; i++) {
           rotatedArray[j++] = array[i];
        }

       for (int i = 0; i < n; i++) {
           rotatedArray[j++] = array[i];
       }

        return rotatedArray;
    }
}
