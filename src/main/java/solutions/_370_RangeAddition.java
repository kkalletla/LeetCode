package solutions;

import Utilities.Print;

public class _370_RangeAddition {

    public static void main(String[] args) {

        Print.printArray(new _370_RangeAddition().getModifiedArray(5, new int[][] {{1,7,2},{2,4,3},{0,2,-2}}));
    }

    public int[] getModifiedArray(int length, int[][] updates) {

        int[] array = new int[length];

        for (int i = 0; i < updates.length; i++) {

            for (int j = Math.max(0, updates[i][0]); j <= Math.min(length - 1, updates[i][1]); j++) {
                array[j] += updates[i][2];
            }
        }


        return array;
    }


}
