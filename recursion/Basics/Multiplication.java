package recursion.Basics;

public class Multiplication {
    public static int multiply(int x, int y) {

        // base case
        if (y == 0) {
            return 0;
        }
        // smaller problem: find x * (y-1)
        // self work: add x to the result of smaller problem
        return x + multiply(x, y - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 4));
    }
}
