package queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basicCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1); //not push()/pop() like stack
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.remove(); //front will be removed
        System.out.println(queue);
        System.out.println(queue.poll()); //works like remove()
        System.out.println(queue.size());
        System.out.println(queue);

        //print without sout
        Queue<Integer> helperQueue = new LinkedList<>();
        while (queue.size() != 0) {
            System.out.println(queue.peek());
            helperQueue.add(queue.poll());
        }
        while (helperQueue.size() != 0) {
            queue.add(helperQueue.poll());
        }

        //reverse a queue using another queue
        Queue<Integer> tempQueue = new LinkedList<>();
        while (queue.size() != 0) {
            tempQueue.add(queue.poll());
        }
        int size = tempQueue.size();
        for (int i = size - 1; i >= 0; i--) {
            queue.add(tempQueue.g);
        }
        System.out.println(queue);
    }
}