package recursion.Basics;

//tc: O(n)
//sc: O(n) for recursion call stack
public class Factorial {

    public static int Fact(int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        return n * Fact(n - 1); // self work + recursive work
        // or
        // smaller problem
        // int factNm1 = Fact(n - 1); // Fact(4)= 24
        // self work: n * n!
        // int factN = n * factNm1;
        // return factN;
    }

    public static void main(String[] args) {
        // assuming n>=0
        System.out.println(Fact(5));
    }
}
