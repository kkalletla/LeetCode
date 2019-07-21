package solutions.topInterviewQuestions.arrays;

public class RotateImage {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix[0] == null)
            return;

        int maxRowColumnLength = (matrix.length % 2 == 0) ? matrix.length / 2 : matrix.length / 2 + 1;
        int length = matrix.length;
        for (int row = 0; row < maxRowColumnLength; row++) {
            for (int column = 0; column < length/2; column++) {

                int swap = matrix[row][column];
                matrix[row][column] = matrix[length - column - 1][row];
                matrix[length - column - 1][row] = matrix[length - row - 1][length - column - 1];
                matrix[length - row - 1][length - column - 1] = matrix[column][length - row - 1];
                matrix[column][length - row - 1] = swap;
            }
        }

    }
}
