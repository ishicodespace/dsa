package recursion.Basics;

//tc: O(k)
//sc: O(k)
class kMultiplesOfN {
    public static void multiples(int n, int k) {
        //1. base case
        if (k == 1) {
            System.out.println(n);
            return;
        }
        
        // 2. smaller problem: find k-1 multiples of n
        multiples(n, k - 1); // 12 24 36 48

        // 3. self work: kth multiple of n
        System.out.println(n * k); // 60 
    }

    public static void main(String[] args) {
        multiples(12, 5);
    }
}