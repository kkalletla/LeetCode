package solutions.topInterviewQuestions.arrays;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        if (digits == null || digits.length == 0)
            return digits;

        List<Integer> number = new ArrayList<Integer>();
        int carry = 1;
        int sum;
        for (int i = digits.length -1; i > -1; i--) {
            sum = digits[i] + carry;
            carry = sum / 10;
            number.add(sum%10);
        }

        if (carry > 0) {
            number.add(carry);
        }

        int[] plusOneNumber = new int[number.size()];
        for (int i = 0; i < number.size(); i++) {
            plusOneNumber[i] = number.get(number.size() - i - 1);
        }

        return plusOneNumber;
    }
}
