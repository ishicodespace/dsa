package extra;

public class extra3 {
   public static int binarysearch(int[] arr, int k) {
        // Code Here
        int s=0;
        int e=(arr.length-1);
        
        while(s<=e)
        {
            int mid=s +(e-s)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                s=mid+1;
            }
            else
            {
                 e=mid-1;
            }
            
        }
    return -1;
    }


     public static void main(String[] args){ 
          int arr[] = { 1, 4, 5, 6, 10 };
          System.out.println(binarysearch(arr,10));
}
}
