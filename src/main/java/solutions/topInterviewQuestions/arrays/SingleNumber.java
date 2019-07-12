package solutions.topInterviewQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> duplicates = new HashMap();

        for (int i: nums) {
            if (!duplicates.containsKey(i))
                duplicates.put(i,1);
            else
                duplicates.remove(i);
        }

        int returnValue = 0;
        for (Integer i: duplicates.keySet()){
            returnValue = i;
        }
        return returnValue;
    }
}
