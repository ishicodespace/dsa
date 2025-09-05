import java.util.ArrayList;

public class Swap2Nos {
    public static void main(String[] args) {
        // Given an ArrayList, swap two elements at specified indices
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list); 

        // Swap elements at index 1 and 3
        int index1 = 1, index2 = 3;
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        System.out.println("List after swapping: " + list);
        // Output: List after swapping: [1, 4, 3, 2, 5]
    }
}
