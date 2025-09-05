package recursion.Arrays;

public class PrintArray {
    public static void print(int arr[], int i) { //1 2 3 4
        //base case
        if (i == arr.length) {
            return;
        }
        //self work
        System.out.println(arr[i]); //1
//recursive work
        print(arr, i +1); //2 3 4 
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        print(arr, 0);
    }
 }
