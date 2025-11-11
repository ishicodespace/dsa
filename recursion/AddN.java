package recursion;

public class AddN {
    public static int addN(int n) {
        if (n == 0) {
            return 0;
        }
        int nth = n;
        int nMinus1th = addN(n - 1);
        return nth + nMinus1th;
    }

    public static void main(String[] args) {
        System.out.println(addN(10));
    }
}
