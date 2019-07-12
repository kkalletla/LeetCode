package solutions.topInterviewQuestions.arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int length = nums.length;
        k = k % length;

        for (int i = 0; i < k; i++) {
            int element = nums[length - 1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = element;
        }
    }
}
