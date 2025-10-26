package stack;

public class StackImplementationLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head = null; //head is top of stack

        // check if stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {

            }
            newNode.next = head;
            head = newNode;
        }

        // pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        // peep operation
        public static int peep() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

        public static void main(String[] args) {
Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) { //loop will run until stack is empty
            System.out.println(stack.peep());
            stack.pop();
        }
        System.out.println(stack.pop()); //print -1 because stack is empty
    }
}
