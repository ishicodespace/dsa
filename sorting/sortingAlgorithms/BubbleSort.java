package sorting.sortingAlgorithms;

//tc: O(n^2)
//sc: O(1)
public class BubbleSort {

    public static int[] BubbleSorting(int arr[]) {
        // compare adjacent elements and swap if the element is greater than next 
        // element so for each pass the largest element will be at the end of the array
        // and we can ignore it in next pass

        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // swap
                swap++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(swap == 0){
                break;
            }
            swap = 0;
        }
        return arr;
    }

    public static void BubbleSortUsingRecursion(int arr[], int i) {
        if (i == arr.length - 1) {
            return;
        }
        BubbleSortUsingRecursion(arr, i + 1);
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2, 6, 7 };

        BubbleSortUsingRecursion(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
