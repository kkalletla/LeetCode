package solutions;

public class _29_DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(new _29_DivideTwoIntegers().divide(-2147483648, 2));
    }

    public int divide(int dividend, int divisor) {

        /*if (divisor == -1)
            return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : 0 - dividend;

        int quotient = 0;

        boolean isNegative = ((dividend < 0) ^ (divisor < 0)) ? true : false;

        dividend = dividend > 0 ? dividend : -dividend;
        divisor = divisor > 0 ? divisor : -divisor;
        while (divisor <= dividend) {
            quotient++;
            dividend -= divisor;
        }
        return isNegative ? -quotient : quotient;*/

        if (dividend == -2147483648 && divisor == -1) return 2147483647;
        if (dividend == 0) return 0;
        if (dividend == -2147483648 && divisor == -2147483648) return 1;
        boolean negative = (dividend > 0) ^ (divisor > 0);
        long divident_ll = Math.abs(dividend), divisor_ll = Math.abs(divisor);

        Long res;
        long multiple = 1, prev_multiple = 1;
        long multiple_value = divisor_ll, prev_multiple_value = 1;
        long multiple_sum = 0;
        long multiple_value_sum = 0;
        while (true) {
            while (multiple_value_sum <= divident_ll) {
                multiple_sum += multiple;
                multiple_value_sum += multiple_value;
                prev_multiple = multiple;
                multiple += multiple;
                prev_multiple_value = multiple_value;
                multiple_value += multiple_value;
            }

            if (prev_multiple == 1) {
                res = multiple_sum - 1;
                break;
            }

            multiple_value_sum -= prev_multiple_value;
            multiple_sum -= prev_multiple;
            multiple = 1;
            multiple_value = divisor_ll;
        }

        if(negative)
            return -res.intValue();

        return res.intValue();
    }
}
