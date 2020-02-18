public class MatrixRotation {


    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        printMatrix(matrix);

        rotateMatrix(matrix, 1);

        printMatrix(matrix);
    }

    private static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int [][] matrix, int times) {
        while (times != 0) {
            // transpose
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[i].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // swap
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < (matrix.length / 2); j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
                }
            }

            times--;
        }
    }


}
