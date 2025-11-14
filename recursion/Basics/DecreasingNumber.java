package recursion.Basics;

public class DecreasingNumber {
    
    public static void Decreasing(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // self work
        System.out.print(n + " ");

        // recursive work
        Decreasing(n - 1);
    }

    public static void main(String[] args) {
        Decreasing(10);
    }
}
