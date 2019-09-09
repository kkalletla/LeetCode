package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _244_ShortestWordDistanceII {

    Map<String, ArrayList<Integer>> wordsWithLocation = null;
    public _244_ShortestWordDistanceII(String[] words) {

        wordsWithLocation = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            ArrayList<Integer> locations = wordsWithLocation.getOrDefault(words[i], new ArrayList<>());
            locations.add(i);
            wordsWithLocation.put(words[i], locations);
        }
    }

    public int shortest(String word1, String word2) {

        List<Integer> word1Occurrences = wordsWithLocation.get(word1);
        List<Integer> word2Occurrences = wordsWithLocation.get(word2);

        int minimum = Integer.MAX_VALUE;

        for (Integer word1Occurrence : word1Occurrences) {
            for (Integer word2Occurrence : word2Occurrences) {
                int difference = Math.abs(word1Occurrence - word2Occurrence);
                minimum = Math.min(difference, minimum);
            }
        }

        return minimum;
    }
}
