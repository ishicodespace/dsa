package recursion.Strings;

public class ReverseString {
    static String reverse(String s, int i) {
        if (i == s.length())
            return "";
        String smallAns = reverse(s, i + 1);
        return smallAns+s.charAt(i)  ;
    }
            public static void main(String[] args) {
                System.out.println(reverse("hello", 0));
            }
}
