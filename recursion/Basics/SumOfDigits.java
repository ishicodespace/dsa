package recursion.Basics;

//tc: O(d) where d is the no of digits
//sc: O(d)
public class SumOfDigits {

    public static int SumOfDigits(int n) {

        // 1. base case
        if (n >= 0 && n <= 9) {
            return n; // return the number itself if it's a single digit
        }

        // 2. self work add the last digit 623%10=3
        // 3. recursive work add remaining digits 623/10=62
        return n % 10 + SumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits(623));
    }
}
