package solutions.topInterviewQuestions.arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int inputLength = nums.length;
        int currentLength = inputLength > 0 ? 1 : 0;

        for (int i=1; i < inputLength; i++) {
            if (nums[currentLength-1] != nums[i]) {
                nums[currentLength++] = nums[i];
            }
        }

        return currentLength;
    }

}
