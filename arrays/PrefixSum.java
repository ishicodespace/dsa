package arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int target = 8;
        // Calculate Prefix Array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Calculate Prefix Sum
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                sum = 0;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; // Because when i=0 then (0-1)=-1 would give an error
                if (sum == target) {
                    System.out.println("found");
                }
            }
        }
        System.out.println(max);
    }

}
