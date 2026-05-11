package sorting.sortingAlgorithms;

//tc: O(n^2)
//sc: O(1)
class SelectionSort {

    public static void SelectionSortFromEnd(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            int largestElementIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[largestElementIndex]) {
                    largestElementIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int smallestElementIndex = i; // assume first element is smallest

            // find minimum element in unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestElementIndex]) {
                    smallestElementIndex = j;
                }
            }

            // and swap it with first element
            int temp = arr[i];
            arr[i] = arr[smallestElementIndex];
            arr[smallestElementIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int nums[] = { 5, 4, 3, 2, 1 };
        SelectionSortFromEnd(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}