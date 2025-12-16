package recursion.Strings;

public class RemoveAllOccurences {

    // tc=O(n^2)
    public static String remove(String s, int i) {
        // i is the current index we are checking
        // 1. base case: reach the end of the string
        if (i == s.length())
            return "";

        // 2. smaller problem: remove from i+1 to end
        String smallAns = remove(s, i + 1);

        // 3. self work: check for i and decide to remove or keep
        if (s.charAt(i) == 'a')
            return smallAns; // return whatever recursion gave
        else
            return s.charAt(i) + smallAns; // O(n) time due to string concatenation
    }

    // tc=O(n^2)
    public static String removeWithoutIndex(String s) {

        // 1. base case
        if (s.length() == 0) {
            return "";
        }

        // 2. smaller problem: send the rest of the string
        String smallAns = removeWithoutIndex(s.substring(1)); // baxc, axc, xc, c, ""

        // 3. self work: check the first character
        if (s.charAt(0) == 'a') {
            return smallAns; // skip 'a' and return the small answer
        } else {
            return s.charAt(0) + smallAns; // keep the character
        }
    }

    public static void main(String[] args) {
        System.out.println(remove("ishika agarwal", 0));
        System.out.println(remove("", 0));
        System.out.println(removeWithoutIndex("ishika agarwal"));
        System.out.println(removeWithoutIndex("aaaaaa"));
    }
}
