import java.util.*;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println("Original List: " + list);  
        Collections.sort(list); // For ascending order
        System.out.println("Sorted List: " + list); 
        Collections.sort(list, Collections.reverseOrder()); // For descending order
        Collections.reverse(list); // Another way to sort in descending order
        System.out.println("Sorted List in Descending Order: " + list); 
        Collections.sort(list, Comparator.naturalOrder()); // For natural order
        System.out.println("Sorted List in Natural Order: " + list);


        //sort string arraylist lexicographically
        ArrayList<String> Stringlist = new ArrayList<>();

    }
}
