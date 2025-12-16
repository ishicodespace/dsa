package recursion.Basics;

//tc: O(n)
//sc: O(n) 
public class DecreasingNumber {

    public static void Decreasing(int n) {
        // 1. base case
        if (n == 0) {
            return;
        }

        // 2. self work: print n
        System.out.print(n + " "); // 5

        // 3. recursive work: solve smaller problem ie to find n-1
        Decreasing(n - 1); // 4,3,2,1
    }

    public static void main(String[] args) {
        Decreasing(10);
    }
}
