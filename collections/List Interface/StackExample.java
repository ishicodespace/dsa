import java.util.*;
//stack is a subclass of vector
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack);
    }
}

// //linked list
// LinkedList<Integer> linkedlist= new LinkedList<>();
// linkedlist.add(23);
// System.out.println(linkedlist);
// linkedlist.remove(0);
// System.out.println(linkedlist);

// //vector
// Vector<String> vector=new Vector<>();
// vector.add("hi bitch");
// vector.add("13");
// System.out.println(vector);
// vector.clear();
// System.out.println(vector);
// System.out.println(vector.capacity());

// //hashset
// Set<Integer> set=new HashSet<Integer>();
// set.add(24);
// set.add(34);
// set.add(34);
// set.add(311);
// System.out.println(set);

// //linkedhashset
// LinkedHashSet<Integer> llset=new LinkedHashSet<>();
// llset.add(334);
// llset.add(334);
// llset.add(6);
// llset.add(9);
// System.out.println(llset);

// //treeset
// TreeSet<Integer> tset=new TreeSet<>();
// tset.add(5);
// tset.add(4);
// tset.add(8);
// tset.add(5);
// System.out.println(tset);

// // queue using linkedlist
// Queue<Integer> queue=new LinkedList<Integer>();
// queue.add(9);
// queue.add(23);
// System.out.println(queue.offer(90));
// System.out.println(queue);
// queue.poll();
// System.out.println(queue);
// System.out.println(queue.peek());

// queue
// map
// hashmap
// HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
// map.put(1, 22);
// map.put(2, 12);
// System.out.println(map);
// System.out.println(map.keySet());
// System.out.println(map.values());
// System.out.println(map.entrySet());
// for (Map.Entry m : map.entrySet()) {
// System.out.println(m.getKey() + " " + m.getValue());
// }
// // treemap
// TreeMap<Integer, Integer> tmap = new TreeMap<>();
// tmap.put(1, 34);
// tmap.put(2, 23);
// System.out.println(tmap.keySet());
// System.out.println(tmap);
// System.out.println(tmap.entrySet());
// for (Map.Entry t : map.entrySet()) {
// System.out.println(t.getKey() + " " + t.getValue());
// }
// // int arr[]={2,35,2,45,1};
// Arrays.sort(arr);
// System.out.println(arr);
// Collections.sort(list);
// Collections.binarySearch(list, 3);