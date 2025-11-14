package recursion.Basics;

public class ReverseNumber {

    public static int ReverseNumber(int n, int rev) {
        // base case
        if (n == 0) {
            return rev;
        }

        // self work
        rev = rev * 10 + n % 10;
        // recursive work
        return ReverseNumber(n / 10, rev);
    }

    public static void main(String[] args) {
        System.out.println(ReverseNumber(192, 0));
    }
}
