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
        public static Node head = null; // head is top of stack

        // function to check if stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // function for push operation
        public static void push(int data) {
            // create new node
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // function for pop operation
        public static int pop() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
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
        Node node1 = new Node(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) { // loop will run until stack is empty
            System.out.println(stack.peep());
            stack.pop();
        }
        System.out.println(stack.pop()); // print -1 because stack is empty
    }
}
