package greedyAlgorithm;

import java.util.*;;

public class MinAbsDifferencePairs {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        //sort both
        Arrays.sort(A); //[1,4,7,8]
        Arrays.sort(B); //[2,3,5,6]

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum absolute difference: "+minDiff);
    }
}
