package solutions.topInterviewQuestions.strings;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        char[] s = new char[] {'h', 'e','l','l','o'};
        reverseString.reverseString(s);
        reverseString.printArray(s);

    }

    public void reverseString(char[] s) {

        if (s == null || s.length == 0 || s.length == 1)
            return;

        int length = s.length;
        for (int i = 0; i < length/2; i++) {
            char swap = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = swap;
        }
    }

    private void printArray(char[] s) {
        for (char c: s)
            System.out.print(c + "\t");
    }
}
