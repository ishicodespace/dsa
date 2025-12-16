package recursion.Basics;

//tc: O(2^n)
//sc: O(n) for recursion call stack
public class FibonacciSeries {

    public static int fibSeries(int n) {
        // 1. base case
        if (n == 0 || n == 1) {
            return n;
        }

        // 2. smaller problem: finding fib(n-1), fib(n-2)
        // 3. self work (adding)
        int prev = fibSeries(n - 1);
        int prevPrev = fibSeries(n - 2);
        return prev + prevPrev;
    }

    public static void main(String[] args) {

        // fibonacci numbers upto 10th digit
        for (int i = 0; i < 10; i++) {
            System.out.print(fibSeries(i) + " ");
        }
        System.out.println();
        System.out.println(fibSeries(5)); // 5th digit of fibonacci series
    }
}
