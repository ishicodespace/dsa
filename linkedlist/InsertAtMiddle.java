
public class InsertAtMiddle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public static void addMiddle(int data, int index) {
    
if(index == 0){
    addFirst(data);
    return;
}   
        //create a new node
        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) { //or use while loop
            temp = temp.next;
        }
        // temp will become the prev node of the index
        if (temp.next == null) {
            tail = newNode;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

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
        System.out.println();
    }

    public static void main(String[] args) {
        addMiddle(5, 0);
        addMiddle(10, 1);
        addMiddle(15, 1);
        print();
        addMiddle(20, 1);
        print();
    }
}