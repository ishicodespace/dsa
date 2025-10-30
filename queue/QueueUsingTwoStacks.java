package queue;

import java.util.*;

public class QueueUsingTwoStacks {
    public static class TwoStacksQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // check if queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // enqueue -> O(n)
        public static void add(int data) {
            // s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // push data to s1
            s1.push(data);
            // s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // dequeue -> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = s1.peek();
            s1.pop();
            return front;
        }
    }

    public static void main(String[] args) {
        TwoStacksQueue q = new TwoStacksQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); 
    }
}
