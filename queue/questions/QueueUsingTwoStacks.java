package queue.questions;

import java.util.*;

public class QueueUsingTwoStacks {
    public static class TwoStacksQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // POP EFFICIENT APPROACH -> pop O(1) , push O(n)

        // check if queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // enqueue -> O(n) like pushing at the bottom so that order of queue is
        // maintained
        public static void add(int data) {
            // s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // make space for the new element at the bottom so we move everything to another
            // stack, push element to empty (first) stack and on top of that push back all
            // elements from second stack to first stack
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

// PUSH EFFICIENT APPROACH -> push O(1) , pop O(n)

// push-> O(1)
// public void push(int x) {
//     s1.push(x);
// }

// pop-> O(n)
// public int pop() {
//     if (s1.isEmpty()) {
//         return -1;
//     }
//     while (!s1.isEmpty()) {
//         s2.push(s1.pop());
//     }
//     int value = s2.pop();
//     while (!s2.isEmpty()) {
//         s1.push(s2.pop());
//     }
//     return value;
// }

// pop-> O(n)
// public int peek() {
//     if (s1.isEmpty()) {
//         return -1;
//     }
//     while (!s1.isEmpty()) {
//         s2.push(s1.pop());
//     }
//     int value = s2.peek();
//     while (!s2.isEmpty()) {
//         s1.push(s2.pop());
//     }
//     return value;
// }