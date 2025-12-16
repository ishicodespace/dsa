package recursion.Basics;

public class DecimalToBinary {

    public static int DecimalToBinary(int n, int rev) {
        //base case
        if (n == 0) {
            return rev;
        }
        //smaller problem
        int lastDigit = n % 2;
        rev = rev * 10 + lastDigit;
        return DecimalToBinary(n / 2, rev);
    }
    

    public static void main(String[] args) {
        System.out.println(DecimalToBinary(9,0));
    }
}
