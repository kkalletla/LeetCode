package Utilities;

public class Print<T> {

    public static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + "\t");
        }
    }

    public static void printArray(String[] array) {
        for (String i: array) {
            System.out.print(i + "\t");
        }
    }

    public void printArray(T[] array) {
        for (T i: array) {
            System.out.print(i + "\t");
        }
    }

    public void printMatrix(T[][] matrix) {

        if (matrix == null && matrix.length <=0 && matrix[0].length <=0)
            return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {

        if (matrix == null && matrix.length <=0 && matrix[0].length <=0)
            return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
