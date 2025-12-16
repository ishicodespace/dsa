package recursion.Arrays;

//tc: O(n)
//sc: O(n)
public class SumOfArray {
    public static int sum(int arr[], int i) {

        // 1. base case: handle empty array and single element array too
        if (i == arr.length) { // sum of empty array is 0
            return 0;
        }

        // 2. smaller problem: find sum of elements from index+1 to end
        int smallProblem = sum(arr, i + 1);

        // 3. self work: add current element to the sum of smaller problem
        return arr[i] + smallProblem;
    }

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(sum(arr, 0));
    }
}
