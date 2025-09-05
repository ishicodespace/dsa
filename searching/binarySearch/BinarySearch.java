package searching.binarySearch;

public class BinarySearch {
    public static int binary_search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
             return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
            end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12};
    int target=40;
  System.out.println(binary_search(arr, target));
    
}
}
