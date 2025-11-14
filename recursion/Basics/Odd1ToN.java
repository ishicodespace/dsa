package recursion.Basics;

public class Odd1ToN {
    
    public static void Odd1ToN(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // recursive call
        Odd1ToN(n - 1);

        // self work
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Odd1ToN(21);
    }
}
