package arrays;

public class MaxSubArraySum_BruteFore {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        int n = arr.length;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) { // start
            for (int j = i; j < n; j++) { // end
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum+" ");
                if (sum > max_sum) {
                    max_sum = sum;
                }
                sum = 0;
               
            }
 System.out.println();
        }
        System.out.println("max sum: " +max_sum);

    }

}