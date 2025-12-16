package recursion.Arrays;

//tc=O(n)   
//sc=O(n)
public class LastOccurence {
    public static boolean Last(int arr[], int target, int i) {

        // 1. base case: reached end of array
        if (i == arr.length) {
            return false;
        }

        // 2. smaller problem: check in rest of array
        // call recursion first, then do self work
        boolean smallAns = Last(arr, target, i + 1);

        // after reaching the end, check from back
        if (arr[i] == target && smallAns == false) { // smallAns will remain false until we find the last occurrence
            System.out.print(i);
            return true;
        }
        return smallAns;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 4, 5, 67, 8, 44, 34, 4, 4, 5, 1 };
        Last(arr, 4, 0);
    }
}
