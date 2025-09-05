package backtracking;

public class ChangeArray {
    public static void change(int arr[], int i, int val) {
        if (i == arr.length - 1){
             print(arr); // 1 2 3 4 0 
        return;
    }
        arr[i] = val;
        change(arr, i + 1, val + 1);
        arr[i] -= 2; //backtracking step
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
       
        change(arr, 0, 1);
        print(arr); // -1 0 1 2 0
    }
}
