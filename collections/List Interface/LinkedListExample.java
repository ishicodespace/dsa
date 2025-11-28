import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
       // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList: " + list);

        // Accessing elements
        Integer firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);

        // Modifying elements
        list.set(1, 25);
        System.out.println("Modified LinkedList: " + list);

        // Removing elements
        list.remove(2);
        System.out.println("After Removal: " + list);

        // Iterating through the list
        System.out.println("Iterating through the LinkedList:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}