package solutions;

import java.util.*;

public class _15_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> triplets = new HashSet<List<Integer>>();

        Map<Integer, Integer> keyValue = new HashMap<Integer, Integer>();

        Arrays.sort(nums);

        for (int i = 0; i< nums.length; i++) {
            keyValue.put(nums[i], i);
        }

        List<Integer> triplet = null;
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int difference = 0 - nums[i] - nums[j];

                if (keyValue.containsKey(difference) && keyValue.get(difference) > j) {
                    triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(difference);
                    triplets.add(triplet);
                }
            }
        }

        return new ArrayList<List<Integer>>(triplets);
    }
}
