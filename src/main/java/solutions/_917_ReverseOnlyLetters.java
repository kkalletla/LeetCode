package solutions;

public class _917_ReverseOnlyLetters {

    public static void main(String[] args) {

        System.out.println(new _917_ReverseOnlyLetters().reverseOnlyLetters("112ab-cd334"));

    }

    public String reverseOnlyLetters(String S) {

        if (S == null || S.length() <= 1)
            return S;

        char[] characters = S.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (Character.isLetter(characters[start]) && Character.isLetter(characters[end])) {
                char temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                start ++;
                end --;
            }

            if ( !Character.isLetter(characters[start])) {
                start++;
            }

            if ( !Character.isLetter(characters[end]) ) {
                end--;
            }
        }

        return new String(characters);
    }
}
