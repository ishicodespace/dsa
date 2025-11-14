package recursion.Basics;

public class CountDigits {
    
    public static int CountDigits(int n) {
        
        //base case
        if (n >= 0 && n <= 9) {
            return 1;
        }

        //self work add 1 for last digit
        //recursive work count remaining digits
        return 1 + CountDigits(n / 10);
    }
    
    public static void main(String[] args) {
       System.out.println(CountDigits(12345));
    }
}
