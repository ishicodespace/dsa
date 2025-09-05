import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiDimAL {
    public static void main(String[] args) {

        // Creating a multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Adding sublist 1
        ArrayList<Integer> subList1 = new ArrayList<>();
        subList1.add(1);
        subList1.add(2);
        mainList.add(subList1);
        // Adding sublist 2
        ArrayList<Integer> subList2 = new ArrayList<>();
        subList2.add(4);
        subList2.add(5);
        mainList.add(subList2);

        // Accessing elements
        System.out.println(mainList);
        System.out.println(mainList.get(0).get(1)); // Output: 24

        // Accessing and printing all elements
        System.out.println("Elements in Multi-Dimensional ArrayList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println(); // Print a new line after each sublist
        }

        // Example: Creating a 2D ArrayList with predefined values
        ArrayList<ArrayList<Integer>> mulArrayList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mulArrayList.add(list1);
        mulArrayList.add(list2);
        mulArrayList.add(list3);
        System.out.println(mulArrayList);
    }
}
