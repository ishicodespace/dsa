import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // arraylist
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);

        // accessing elements
        Integer firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);

        // modifying elements
        list.set(1, 20);
        System.out.println("Modified ArrayList: " + list);

        // removing elements
        list.remove(2);
        System.out.println("After Removal: " + list);

        // iterating through the list
        System.out.println("Iterating through the list:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}