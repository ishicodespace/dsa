package arrays;

public class single_element_among_double {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,5,3,4};
        int count=2;
        int answer=arr[0];
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                answer=arr[i];
            }
          
        }
        }
        System.out.println(answer);
    }
}
