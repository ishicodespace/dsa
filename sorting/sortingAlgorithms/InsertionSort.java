package sorting.sortingAlgorithms;

public class InsertionSort {
    public static int[] InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
        int current = arr[i];
        int prev = i - 1;
        while (prev >= 0 && arr[prev] > current) {
        arr[prev + 1] = arr[prev];
        prev--;
        }
        arr[prev + 1] = current;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
// int arr[] = { 5,4,3,2,1 };
// for (int i = 1; i < arr.length; i++) {
// int current = arr[i];
// int j = i;

// while (j > 0 && current < arr[j - 1]) {
// arr[j] = arr[j - 1];
// j--;
// System.out.println(j);
// }
// arr[j] = current;
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }