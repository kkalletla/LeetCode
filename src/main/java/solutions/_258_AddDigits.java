package solutions;

public class _258_AddDigits {

    public static void main(String[] args) {

        System.out.println(new _258_AddDigits().addDigits(65536));
    }

    public int addDigits(int num) {

        if (num == 0)
            return 0;
        return num - 9 * Math.floorDiv( (num - 1), 9);
    }
}
