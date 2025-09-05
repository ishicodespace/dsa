package arrays;

public class LargestNo {
    public static int largest_smallest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i:arr){
            if(largest<i){
                largest=i;
            }
            if(smallest>i){
                smallest=i;
            }
        }
        System.out.println(largest);
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,333,4,23,223};
        
        System.out.println(largest_smallest(arr));
    }
}
