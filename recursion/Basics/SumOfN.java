package recursion.Basics;

public class SumOfN {
    
    public static int addN(int n) {
        //base case
        if (n == 0) {
            return 0;
        }
        int nth = n; // nth term
        int nMinus1th = addN(n - 1);
        return nth + nMinus1th; // self work + recursive work
    } 

    public static void main(String[] args) {
        System.out.println(addN(10));
    }
}
