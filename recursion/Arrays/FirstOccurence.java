package recursion.Arrays;

//tc=O(n)
//sc=O(n)
public class FirstOccurence {
    public static int First(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return First(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 6, 2, 6, 7 };
        System.out.println(First(arr, 6, 0));
    }
}
