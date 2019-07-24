package solutions;

public class _706_ToLowerCase {

    public String toLowerCase(String str) {

        if (str == null && str.equals(""))
            return str;

        StringBuilder string = new StringBuilder();

        for (char c: str.toCharArray()) {

            char ch = c;
            if (c >= 'A' && c <= 'Z')
                ch = (char) (c + 'a' - 'A');

            string.append(ch);
        }

        return string.toString();
    }
}
