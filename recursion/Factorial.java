package recursion;

public class Factorial {
    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Fact(n - 1);
        // or
        // int factNm1 = Fact(n - 1);
        // int factN = n * factNm1;
        // return factN;
    }

    public static void main(String[] args) {
        System.out.println(Fact(7));
    }
}
