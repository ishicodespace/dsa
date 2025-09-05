package recursion.Arrays;
public class CheckIfArraySorted {
    static boolean sorted(int arr[],int i){
        if (i == arr.length - 1) 
            return true;
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return(sorted(arr, i + 1));
        
}

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        System.out.println(sorted(arr, 0));
    }
}
