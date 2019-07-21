package solutions;

public class _7_ReverseInteger {

    public int reverse(int x) {

        Long reverseNumber = 0L;

        while (x != 0) {
            reverseNumber = (reverseNumber * 10) + (x % 10);
            x = x / 10;
        }

        return (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) ? 0 : reverseNumber.intValue();
    }
}
