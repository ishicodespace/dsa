package sorting.Questions;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 0, 3, 0, 1 };
        int n = arr.length;
        boolean flag = false;
        // using bubble sort approach
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            if (!flag) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
