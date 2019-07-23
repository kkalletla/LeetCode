package solutions.topInterviewQuestions.strings;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] characters = new int[26];

        for (char c: s.toCharArray()){
            characters[c - 'a']++;
        }

        for (char c: t.toCharArray()){
            characters[c - 'a']--;
        }

        for (int i: characters) {
            if (i != 0)
                return false;
        }

        return true;

    }
}
