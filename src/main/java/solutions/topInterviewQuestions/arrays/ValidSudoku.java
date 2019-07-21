package solutions.topInterviewQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {

    Map<Character, Integer> characterMap = new HashMap<Character, Integer>();

    public boolean isValidSudoku(char[][] board) {

        characterMap.put('.', 0);
        characterMap.put('1', 1);
        characterMap.put('2', 2);
        characterMap.put('3', 3);
        characterMap.put('4', 4);
        characterMap.put('5', 5);
        characterMap.put('6', 6);
        characterMap.put('7', 7);
        characterMap.put('8', 8);
        characterMap.put('9', 9);

        return validateRowsAndColumns(board) && validate3X3Grid(board);
    }

    private boolean validateRowsAndColumns(char[][] board) {

        for (int i = 0; i < 9; i++) {
            int[] numbersCounterForRows = new int[10];
            int[] numbersCounterForColumns = new int[10];
            for (int j = 0; j < 9; j++) {
                numbersCounterForRows[characterMap.get(board[i][j])]++;
                numbersCounterForColumns[characterMap.get(board[j][i])]++;
            }

            for (int k = 1; k < 10; k++)
                if (numbersCounterForRows[k] > 1 || numbersCounterForColumns[k] > 1)
                    return false;
        }
        return true;
    }

    private boolean validate3X3Grid(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] numbersCounterForGrid = new int[10];

                for (int l = 0; l < 3; l++) {
                    for (int m = 0; m < 3; m++) {
                        numbersCounterForGrid[characterMap.get(board[i*3+l][j*3+m])]++;
                    }
                }

                for (int k = 1; k < 10; k++)
                    if (numbersCounterForGrid[k] > 1)
                        return false;
            }
        }
        return true;
    }

}
