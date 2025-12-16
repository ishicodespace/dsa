package recursion.Basics;

//tc: O(n)
//sc: O(n)
public class SumOfNNumbers {

    public static int addN(int n) {
        // 1. base case
        if (n == 0) {
            return 0;
        }
        int nth = n; // nth term
        int nMinus1th = addN(n - 1); // smaller problem
        return nth + nMinus1th; // 2. self work + 3. recursive work
    }

    public static void main(String[] args) {
        System.out.println(addN(10));
    }
}
