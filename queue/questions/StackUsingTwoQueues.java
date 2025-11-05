package queue.questions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    public static class TwoQueueStack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        //check empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        //enqueue -> O(1)
        public static void add(int data) {
            //push into non-empty queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        //dequeue -> O(n)
        public static int remove() {
            if (q1.isEmpty() && q2.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;

            //case 1: if q1 is non-empty
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }

            //case 2: if q2 is non-empty
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek -> O(n)
        public static int peek() {
            if (q1.isEmpty() && q2.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;

            //case 1: if q1 is non-empty
            if(!q1.isEmpty())
            {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                 }
        }
        //case 2: if q2 is non-empty
        else
        {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
        public static void main(String[] args) {
            TwoQueueStack s = new TwoQueueStack();
            s.add(1);
            s.add(2);
            s.add(3);
            s.add(4);
                System.out.println(s.peek());
                System.out.println(s.remove());
              
            }
    }
}
