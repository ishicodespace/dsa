package recursion.Basics;

public class SumOfNOdd {

    public static int SumOfOdd(int n) {

        //base case
        if (n == 0) {
            return 0;
        }

        int nth = (n % 2 != 0) ? n : 0; // nth term
        int nMinus1th = SumOfOdd(n - 1);
        return nth + nMinus1th; // self work + recursive work
    }
    
    public static void main(String[] args) {
        System.out.println(SumOfOdd(10));
    }
}
