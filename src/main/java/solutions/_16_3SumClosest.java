package solutions;

import java.util.Arrays;

public class _16_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int returnSum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            int currentSum = nums[i] + nums[j] + nums[k];

            /*if ( nums[i] + nums[j] + nums[k] > )*/
        }

        return returnSum;
    }
}
