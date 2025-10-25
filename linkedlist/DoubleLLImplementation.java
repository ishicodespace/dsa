public class DoubleLLImplementation {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // corner case: empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first
    public static int removeFirst() {
       
        // corner case: empty list
        if (size == 0) {
            head = tail = null;
            return -1;
        }

        //single node
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value= head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    // add last
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        //corner case: empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove last
    public static int removeLast() {

        //corner case: empty list
        if (size == 0) {
            head = tail = null;
            return -1;
        }

        //single node
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        //more than one node
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }
    
    //reverse a doubly linked list  
    public static void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head=prev;
    }
    // print the linked list
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        print();
        System.out.println();
        removeFirst();
        print();
        reverse();
        System.out.println();
        print();
    }
}
