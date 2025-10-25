import java.util.LinkedList;

public class CollectionsLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // add elements to the linked list
        list.add(1);
        list.add(2);

        //add element at the beginning
        list.addFirst(0);
 
        //add element at the end
        list.addLast(3);

        //remove elements from the linked list
        list.removeFirst(); // removes 0
        list.removeLast(); // removes 3

    }
}
