package recursion.Basics;

//tc: O(d) where d is the no of digits
//sc: O(d) 
public class CountDigits {

    public static int CountDigits(int n) {

        // 1. base case
        if (n >= 0 && n <= 9) {
            return 1;
        }

        // 2. self work add 1 for last digit
        // 3. recursive work count remaining digits
        return 1 + CountDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(CountDigits(12345));
    }
}
