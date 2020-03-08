package solutions;

import Utilities.Print;

public class _80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {

        int numsLength = nums.length;

        if (numsLength <= 2)
            return numsLength;

        int currentPointer = 2;
        int length = 2;

        while (currentPointer < numsLength) {
            if (nums[currentPointer] == nums[length - 1] && nums[currentPointer] == nums[length - 2]) {
                currentPointer++;
            } else {
                nums[length] = nums[currentPointer];
                currentPointer++;
                length++;
            }
        }

        return length;
    }
}
