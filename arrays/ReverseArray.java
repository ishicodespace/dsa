package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 5, 7, 9 };
        int start = 0;
        int end = arr.length - 1;
        // Swapping first and last elements and then moving start forward and end
        // backward
        while (start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Using another array
        // int reverse[]=new int[arr.length];
        // int n=arr.length;
        // for(int i=0;i<arr.length;i++){
        // reverse[n-i-1]=arr[i];
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}
