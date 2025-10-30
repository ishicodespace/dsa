package stack;
import java.util.ArrayList;
public class StackImplementationAL {
    // create a class Stack
     static class Stack {
         static ArrayList<Integer> stack = new ArrayList<>();
        
        // function to check if stack is empty
        public static boolean isEmpty() {
            // System.out.println(stack.isEmpty());
            return stack.size() == 0;
        }

        // function for push operation
        public static void push(int data) {
            stack.add(data);
        }

        // pop operation
        public static int pop() {
            if(isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int top = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1); 
            return top;
        }

        // peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = stack.get(stack.size() - 1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) { //loop will run until stack is empty
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println(stack.pop()); //print -1 because stack is empty
    }
}
