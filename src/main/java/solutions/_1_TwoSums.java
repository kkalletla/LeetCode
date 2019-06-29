package solutions;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSums {

    public static void main(String[] args) {

        System.out.println(_1_TwoSums.twoSum(new int[] {2,7,11,15}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numberMap.containsKey(target - nums[i]))
                return new int[] {numberMap.get(target - nums[i]), i};

            numberMap.put(nums[i],i);
        }

        throw new IllegalArgumentException("No Solution with the arguments");
    }
}
