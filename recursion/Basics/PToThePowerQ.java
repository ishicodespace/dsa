package recursion.Basics;

//tc: O(log q)
//sc: O(log q)
public class PToThePowerQ {

    public static int power(int p, int q) {
        // 1. base case
        if (q == 0) {
            return 1;
        }
        // 2. smaller problem
        int smallPow = power(p, q / 2);

        // 3. self work
        // q is even
        if (q % 2 == 0) {
            return smallPow * smallPow; // we dont do power(p, q / 2) * power(p, q / 2) to reduce no of calls

        }
        // q is odd
        return p * smallPow * smallPow;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}

// tc:O(q)
// sc:O(q)
// public static int power(int p, int q) {
// if (q == 0) {
// return 1;
// }
// return p*power(p, q-1);
// }