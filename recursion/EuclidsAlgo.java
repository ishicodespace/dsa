package recursion;

public class EuclidsAlgo {
    public static int euclid(int x, int y) {
        if (y == 0) {
            return x;
        }
        return euclid(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(euclid(15, 24));
    }
}
