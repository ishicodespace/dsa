package recursion.Arrays;

public class MaxInArray 
{
    public static int max(int arr[], int i) { // 1 2 3 4
        // base case
        if (i == arr.length) {
            return arr[i];
        }
//idx+1 to end of array ->max -recursive work
int smallProb = max(arr, i + 1);
//self work and final ans
return Math.max(arr[i], smallProb);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 35, 44,12 };
System.out.println(max(arr, 0));    }
}