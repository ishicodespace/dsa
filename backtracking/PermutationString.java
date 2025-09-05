package backtracking;

public class PermutationString {
    public static void permutation(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // character choosen
      
        // no choice
        permutation(str, ans, i + 1);
    }

    public static void main(String[] args) {
        permutation("abc", " ", 0);
    }
}
