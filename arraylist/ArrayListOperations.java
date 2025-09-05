import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add new element O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.add(3, 40); // O(n) but normal add is O(1)
        System.out.println(list);

        // get an element O(1)
        System.out.println(list.get(0));

        // remove an element O(n) because element is searched one by one and then removed
        list.remove(Integer.valueOf(20)); // remove by value, an object of wrapper class is passed
        list.remove(1); // remove by index
        System.out.println(list.remove(0)); // returns true or false
        System.out.println(list);

        //set an element O(n) because element is searched one by one
        list.set(0, 20);
        System.out.println(list);

        //contains an element O(n)
        System.out.println(list.contains(20)); // true
        System.out.println(list.contains(10)); // false

        // size of the list O(1)
        System.out.println(list.size()); //method not property 

        // iterate over the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }

        //if you don't specify class, you can add anything to the list
        ArrayList mixList = new ArrayList();
        mixList.add(10);
        mixList.add("Hello");
        mixList.add(3.14);
        System.out.println(mixList);

    }
}
