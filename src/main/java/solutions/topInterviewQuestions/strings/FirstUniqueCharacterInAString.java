package solutions.topInterviewQuestions.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInAString().firstUniqChar(null));
    }

    public int firstUniqChar(String s) {

        if (s == null || s.length() == 0)
            return -1;

        Map<Character, Integer> characterMap = new LinkedHashMap<Character, Integer>();

        for (char c: s.toCharArray()) {
            Integer occurrences = characterMap.get(c);

            characterMap.put(c, occurrences == null ? 1 : occurrences + 1);
        }

        for (Map.Entry<Character, Integer> entry: characterMap.entrySet()) {
            if (entry.getValue() == 1)
                return s.indexOf(entry.getKey());
        }

        return -1;
    }
}
