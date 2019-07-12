package solutions.topInterviewQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> unique = new HashMap();
        for (int i: nums)
            if (unique.get(i) != null)
                return true;
            else
                unique.put(i,1);

        return false;
    }
}
