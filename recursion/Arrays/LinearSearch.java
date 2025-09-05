package recursion.Arrays;

//check if target is present
public class LinearSearch {
    public static boolean linear(int arr[], int target, int i) {
        if (i == arr.length)
            return false;

        if (arr[i] == target)
            return true;
        return linear(arr, target, i + 1);
        //or
        // if (linear(arr, target, i + 1))
        // return true;
        // else
        // return false;

    }

    // return index of target
    public static int returnIndexOfTarget(int arr[], int target, int i) {
        if (i >= arr.length)
            return -1;

        if (arr[i] == target)
            return i;
        return returnIndexOfTarget(arr, target, i + 1);

    }

    // find all indices where target is present
    public static void returnMultipleIndex(int arr[], int target, int i) {
        // base case
        if (i >= arr.length)
            return;
        // self work
        if (arr[i] == target)
            System.out.print(i + " ");
        // recursive work
        returnMultipleIndex(arr, target, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 3, 8, 8 };
        int arr2[] = { 8, 8, 8, 76, 7, 8 };
        System.out.println(linear(arr, 8, 0));
        System.out.println(returnIndexOfTarget(arr, 8, 0));
        returnMultipleIndex(arr2, 8, 0);
    }
}
