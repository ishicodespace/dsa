package queue;
import java.util.*;
public class StackUsingDeque {
    public static class DequeStack {
        //stack is a deque
static Deque<Integer> deque = new LinkedList<>();

        //push -> O(1)
        public static void add(int data) {
            deque.addLast(data);
        }

        //pop -> O(1)
        public static int remove() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeLast();
        }
        
        //peek -> O(1)
        public static int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast();
        }
    }
    
    public static void main(String[] args) {
        DequeStack stack = new DequeStack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        while (!stack.deque.isEmpty()) {
            System.out.println(stack.peek());
            stack.remove();
        }
    }
}
