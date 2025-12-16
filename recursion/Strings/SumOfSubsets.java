package recursion.Strings;

public class SumOfSubsets {

    //tc=O(2^n)
    //sc=O(h)=O(n)
    public static void sumOfSubsets(int arr[], int i, int sum) {

        // base case
        if (i == arr.length) {
            System.out.println(sum);
            return;
        }
        int currNumber = arr[i]; //currently decide for 2

        // currNumber: chooses to be added
        sumOfSubsets(arr, i + 1, currNumber + sum);

        // currNumber: chooses to not be added
        sumOfSubsets(arr, i + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4,5 };
        sumOfSubsets(arr, 0, 0);
    }
}
