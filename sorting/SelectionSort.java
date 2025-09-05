package sorting;

class SelectionSort {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] > arr[j]) {
                    largest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}