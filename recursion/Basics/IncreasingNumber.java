package recursion.Basics;

public class IncreasingNumber {
    
    public static void increasing(int n) {
        // 1. base case: when n is 0, stop the recursion
        if (n == 0) {
            return;
        }
        // 2. recursive work solves the smaller problem
        increasing(n - 1); // 1,2,...,n-1

        // 3. self work: print n cause recursion will print 1 to n-1
        System.out.print(n + " "); // n
    }

    public static void main(String[] args) {
        increasing(10);
    }
}
