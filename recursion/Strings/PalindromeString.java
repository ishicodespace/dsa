package recursion.Strings;

public class PalindromeString {

    // tc=O(n)
    static boolean checkPalindrome(String s, int left, int right) {

        // base case: left pointer crossed right pointer
        if (left >= right) {
            return true;
        }

        // self work: check first and last character && smaller problem: rest of the string
        if (s.charAt(left) == s.charAt(right) && checkPalindrome(s, left + 1, right - 1)) {
            return true;
        }
        return false;
        //return s.charAt(left) == s.charAt(right) && checkPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s = "level";
        System.out.println(checkPalindrome(s, 0, s.length() - 1));
    }
}
