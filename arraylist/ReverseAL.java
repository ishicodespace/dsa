import java.util.*;

public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        // Output: Original List: [1, 2, 3, 4, 5]

        // Reverse the ArrayList 
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
            temp = list.get(i);
        // System.out.print(list.get(list.size() - 1 - i) + ","); O(n)

        }
        System.out.println("Reversed List: " + list); // Output: Reversed List: [5, 4, 3, 2, 1]

       
        //another way to reverse
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
     
        // using manual swapping
        for (int i = 0; i < newList.size()/2; i++) {
            int temp = newList.get(newList.size() - 1 - i);
            newList.set(newList.size() - 1 - i, newList.get(i));
            newList.set(i, temp);
        }
        System.out.println("Reversed List using manual swapping: " + newList);
        // using collections
        Collections.reverse(newList);
        System.out.println("Reversed List using Collections: " + newList);

}



}