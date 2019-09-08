package solutions;

import java.util.*;

public class _438_FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> resultIndices = new LinkedList<Integer>();

        int[] patternMap = new int[26];
        int[] stringMap = null;

        for(char c: p.toCharArray()) {
            patternMap[c - 'a']++;
        }

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            boolean loopBroken = false;
            stringMap = new int[26];
            for (int j = i; j - i < p.length(); j ++) {

                if (patternMap[s.charAt(j) - 'a'] > 0) {
                    char check = s.charAt(j);
                    stringMap[check - 'a'] ++;
                } else {
                    i = j;
                    loopBroken = true;
                    break;
                }
            }

            if (!loopBroken && Arrays.equals(patternMap,stringMap)) {
                resultIndices.add(i);
            }
        }


        return  resultIndices;
    }
}
