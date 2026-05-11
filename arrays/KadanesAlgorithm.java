package arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = { -7, -1, -3, -9, -4, -1, -10, 0 };
        int current_sum = 0, max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            current_sum = current_sum + arr[i];
            max_sum = Math.max(max_sum, current_sum);

            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
