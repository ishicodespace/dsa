package queue;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    static class Queue {
        public static Node head;
        public static Node tail;
        static int size = 0;

        // check if queue is empty
        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        // enqueue ->O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            size++;
            if (head==null) {
                head = tail = newNode;
                return; 
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue -> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            size--;
            //store value of front 
            int front = head.data;
            // single node
            if (head == tail) {
                head = tail = null;
            } 
            // multiple nodes
            else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.size); // 3
    }
}
