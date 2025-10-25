
public class InsertAtFirst {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    // Non-static method→ someone inside a house (object)
    // Can access the house’s doors and windows (non-static fields)
    // Can also see the neighborhood mailbox (static field shared by all houses)
    // Static method→ someone standing on the street (class-level)
    // Cannot see any specific house doors (non-static fields)
    // Can only see neighborhood mailbox (static fields)
    // so static methods can access only static data members directly
    // and non-static methods can access both static and non-static data members
    // directly
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = newNode; // set head to new node
            tail = newNode; // set tail to new node as well since it's the only node
            return;
        }
        newNode.next = head; // link new node to head (contains address of first node)
        head = newNode; // new node becomes the new head
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // since insertAtFirst is static we can call it using class name
        InsertAtFirst.addFirst(5);
        InsertAtFirst.addFirst(10);
        InsertAtFirst.addFirst(15);
        InsertAtFirst.print();
    }
}
