package recursion;

public class Multiplication {
    public static int multiply(int x, int y) {
        if (y == 0)
            return 0;
        else
            return x + multiply(x, y - 1);
    }
    public static void main(String[] args) {
        System.out.println(multiply(5, 4));
    }
}
