package recursion.Strings;

public class ReverseString {
    static String reverse(String s, int i) {

        // base case: empty string left
        if (i == s.length())
            return "";

        // smaller problem: reverse the i+1 to end string
        String smallAns = reverse(s, i + 1); // xcab

        // self work: append the current character to the end of the ans
        return smallAns + s.charAt(i); // xcab + a
    }

    public static void main(String[] args) {
        System.out.println(reverse("abacx", 0));
    }
}
