package recursion.Basics;

//tc: O(n)
//sc: O(n)
public class IncreasingNumber {

    public static void increasing(int n) {
        // 1. base case: when n is 0, stop the recursion
        if (n == 0) {
            return;
        }
        // 2. recursive work: solves the smaller problem
        increasing(n - 1); // assumption -> that this will print 1 to n-1 (1,2,3,4)

        // 3. self work: print only 5 and let recusrion print the rest
        System.out.print(n + " "); // 5
    }

    public static void main(String[] args) {
        increasing(5);
    }
}
