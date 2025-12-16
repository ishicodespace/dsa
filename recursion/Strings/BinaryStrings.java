package recursion.Strings;

public class BinaryStrings {
    static void bString(String str, int i, StringBuilder newStr) {
        // print binary string without consecutive ones
        if (i == str.length() - 1) {
            System.out.println(newStr);
            return;
        }
        if (str.charAt(i) != str.charAt(i + 1))
            bString(str, i + 1, newStr.append(str.charAt(i)));
        else
            bString(str, i + 1, newStr);
    }

    public static void main(String[] args) {
        bString("110101011", 0, new StringBuilder(" "));
    }
}
