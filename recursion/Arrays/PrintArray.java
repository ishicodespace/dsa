package recursion.Arrays;

//tc: O(n)
//sc: O(n)
public class PrintArray {
    public static void print(int arr[], int i) { // 1 2 3 4
        // i: representing which index we are talking about in the current method call
        // base case: empty array or reached end of array
        if (i == arr.length) {
            return;
        }

        // self work: print arr[i]
        System.out.println(arr[i]); // 1

        // recursive work: print arr from i+1 to end
        print(arr, i + 1); // 2 3 4
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        print(arr, 0);
    }
}
