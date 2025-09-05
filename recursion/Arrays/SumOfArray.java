package recursion.Arrays;

public class SumOfArray {
    public static int sum(int arr[], int i) { //1 2 3 4
        //base case
        if (i == arr.length - 1) { //or if(i==arr.length) return 0;
            return arr[i]; //handle 0 length seperately 
        }
        if(i==0) 
            return 0;

        int smallProb = sum(arr, i + 1);
        return (arr[i] + smallProb);
    }

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(sum(arr, 0));
    }
 }
