package recursion;

//tc=O(log(min(x,y)))
//sc=O(log(min(x,y))) 
public class EuclidsAlgo {
    public static int euclid(int x, int y) {

        // 1. base case
        if (y == 0) {
            return x;
        }
        // 2. smaller problem: to find gcd(y, x%y)
        return euclid(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(euclid(15, 24));
    }
}
