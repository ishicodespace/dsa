package recursion.Basics;

public class Even1ToN {
    
    public static void Even1ToN(int n) {
        // base case
        if (n == 1) {
            return;
        }

        // recursive call
        Even1ToN(n - 1);

        // self work
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Even1ToN(21);
    }
}
