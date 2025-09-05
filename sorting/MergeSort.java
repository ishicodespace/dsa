package sorting;

public class MergeSort {
    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i]; // l will not always be 0 so add l factor
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];

            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        // base case
        if (l >= r)
            return;
        int mid = (l + r) / 2;
        // recursion
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        // self work
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 5, 2 };
        int n = arr.length;
        System.out.println("Array before sorting");
        display(arr); // 4, 1, 3, 5, 2
        mergeSort(arr, 0, n - 1);
        System.out.println("Array after sorting");
        display(arr); // 1, 2, 3, 4, 5
    }

    // Print the array
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
