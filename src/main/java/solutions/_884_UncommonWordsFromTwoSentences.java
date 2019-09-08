package solutions;

import Utilities.Print;

import java.util.*;

public class _884_UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {

        Map<String, Integer> map = new HashMap<>();

        for (String s: A.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (String s: B.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        List<String> uncommonStrings = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1)
                uncommonStrings.add(entry.getKey());
        }

        return uncommonStrings.toArray(new String[uncommonStrings.size()]);
    }
}
