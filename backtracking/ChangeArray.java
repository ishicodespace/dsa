package backtracking;

public class ChangeArray {

    // function to insert 1,2,3,4,5 to empty array
    // and backtrack to change them to -1,0,1,2,3
    // tc: O(n), sc: O(n)
    public static void change(int arr[], int i, int val) {

        // base case
        if (i == arr.length) {
            print(arr); // 1 2 3 4 5
            return;
        }
        // self work
        arr[i] = val;
        // recursive call
        change(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; // backtracking step
    }

    // function to print array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        change(arr, 0, 1);
        print(arr); // -1 0 1 2 3
    }
}
