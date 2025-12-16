package recursion.Arrays;

//tc=O(n)
//sc=O(n)
public class CheckIfArraySorted {
    static boolean sorted(int arr[], int i) {

        //base case
        if (i == arr.length - 1) {
            return true;
        }

        //self work: check current and next element
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        //smaller problem: rest of the array
        return (sorted(arr, i + 1));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        System.out.println(sorted(arr, 0));
    }
}
