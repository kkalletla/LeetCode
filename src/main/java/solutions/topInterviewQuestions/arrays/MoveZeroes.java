package solutions.topInterviewQuestions.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        List<Integer> nonZero = new ArrayList<Integer>();

        for (int i: nums) {
            if (i != 0)
                nonZero.add(i);
        }

        int i;
        for (i = 0; i < nonZero.size(); i++)
            nums[i] = nonZero.get(i);
        for (; i< nums.length; i++)
            nums[i] = 0;
    }
}
