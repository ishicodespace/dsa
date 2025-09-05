import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        // Find the maximum element in an ArrayList
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum Element: " + max); // Output: Maximum Element: 5
    }
}
