package recursion.Arrays;

public class LastOccurence {
    public static int Last(int arr[], int key, int i) {
        // if (i == 0)
        //     return -1;
        // if (arr[i] == key)
        //     return i;
        // return Last(arr, key, i - 1);
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Last(arr, key, i -1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 4, 5, 67, 8,44,34,4,4,5,1 };
        System.out.println(Last(arr, 4, arr.length-1));
    }
}
