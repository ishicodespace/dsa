package recursion.Arrays;

//tc: O(n)
//sc: O(n) 
public class MaxInArray {
    public static int max(int arr[], int i) { // 1 2 3 4
        // base case
        if (i == arr.length) {
            return arr[i]; //return last element in array to compare with previous ones
        }
        // smaller problem: find max of i+1 to end of array
        int smallProb = max(arr, i + 1);

        // self work: find max of arr[i] and smallProb
        return Math.max(arr[i], smallProb);
    }

    public static void main(String[] args) {
        //constraint: arr.length > 0
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(max(arr, 0));
    }
}