
public class InsertAtEnd {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void addLast(int data) {
        // create a new node
        Node newNode = new Node(data);
        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.print();
    }
}
