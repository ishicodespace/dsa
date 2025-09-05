import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targetSum = 35;

        // Brute Force Approach
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    break; // Exit after finding target pair
                }
            }
        }
        System.out.println("No pair found using Brute Force Approach");

        // Two Pointer Approach
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while (leftPointer < rightPointer) {
            int sum = list.get(leftPointer) + list.get(rightPointer);
            //case when sum is equal to targetSum
            if (sum == targetSum) {
                System.out.println("Pair found using Two Pointer Approach: (" + list.get(leftPointer) + ", "
                        + list.get(rightPointer) + ")");
                break; // Exit after finding target pair
            }
            //case when sum is not equal to targetSum
            else if (sum > targetSum) {
                rightPointer--; // Move right pointer left to decrease sum
            }
            //case when sum is less than targetSum
            else {
                leftPointer++; // Move left pointer right to increase sum
            }
        }
    }
}
