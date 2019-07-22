package solutions;

import java.util.HashMap;
import java.util.Map;

public class _8_StringToInteger {

    public static void main(String[] args) {
        System.out.println(new _8_StringToInteger().myAtoi("9223372036854775808"));
    }
    Map<Character, Integer> characterMap = new HashMap<Character, Integer>();

    public int myAtoi(String str) {

        if (str == null)
            return 0;

        Long returnNumber = 0L;
        Boolean isNegative;
        characterMap.put('0', 0);
        characterMap.put('1', 1);
        characterMap.put('2', 2);
        characterMap.put('3', 3);
        characterMap.put('4', 4);
        characterMap.put('5', 5);
        characterMap.put('6', 6);
        characterMap.put('7', 7);
        characterMap.put('8', 8);
        characterMap.put('9', 9);

        int i = 0;
        str = str.trim();
        if (str.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (str.charAt(0) == '+') {
            isNegative = false;
            i++;
        } else if (!characterMap.containsKey(str.charAt(0)))
            return 0;
        else
            isNegative = false;

        char[] charNumber = str.toCharArray();
        for ( ; i < charNumber.length; i++) {
            if (characterMap.containsKey(charNumber[i])) {
                returnNumber = returnNumber * 10 + characterMap.get(charNumber[i]);
            } else
                break;
            if (returnNumber > Integer.MAX_VALUE)
                break;
        }

        returnNumber = isNegative ? -returnNumber : returnNumber;
        returnNumber = returnNumber > Integer.MAX_VALUE ? Integer.MAX_VALUE : returnNumber;
        returnNumber = returnNumber < Integer.MIN_VALUE ? Integer.MIN_VALUE : returnNumber;

        return returnNumber.intValue();

    }
}
