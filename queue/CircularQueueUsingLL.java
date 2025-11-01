package queue;

public class CircularQueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size;

    //check if queue is empty
    public static boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    //enqueue
    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head; //circular link
        size++;
    }
     
    //dequeue
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        size--;
        int front = head.data;
        //single node
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; //maintain circular link
        }
        return front;
    }
}



