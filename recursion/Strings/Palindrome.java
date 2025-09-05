package recursion.Strings;

public class Palindrome {
    static boolean checkPalindrome(String s, int l, int r) {
        if ( l>= r) {
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && checkPalindrome(s, l + 1, r - 1));
            
       
    }

    public static void main(String[] args) {
        String s = "hellogr";
        System.out.println(checkPalindrome(s, 0,s.length()-1 ));
    }
}
