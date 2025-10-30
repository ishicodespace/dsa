package queue;

import java.util.Deque;
import java.util.LinkedList;
public class QueueUsingDeque {
    public static class Queue {
        // queue is a deque
        static Deque<Integer> deque = new LinkedList<>();

        // push -> O(1)
        public static void add(int data) {
            deque.addLast(data);
        }

        // pop -> O(1)
        public static int remove() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeFirst();
        }

        // peek -> O(1)
        public static int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
