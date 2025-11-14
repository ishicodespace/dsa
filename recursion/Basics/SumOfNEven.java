package recursion.Basics;

public class SumOfNEven {

    public static int SumOfEven(int n) {

        // base case
        if (n == 0) {
            return 0;
        }

        int nth = (n % 2 == 0) ? n : 0; // nth term
        int nMinus1th = SumOfEven(n - 1);
        return nth + nMinus1th; // self work + recursive work
    }

    public static void main(String[] args) {
        System.out.println(SumOfEven(10));
    }
}
