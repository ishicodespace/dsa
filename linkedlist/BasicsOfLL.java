
public class BasicsOfLL {

    // a static nested class does not need an instance of the outer class to be instantiated
    static class Node {
        int data;
        Node next; // reference variable to point to another node object
        // next is not an object itself -> it’s a reference variable of the type Node that can point to
        // an object of type Node.

        public Node(int data) {
            this.data = data;
            this.next = null;
            // we assume that when a node is created, it does not point to any other node
        }


        // head is created outside the node class because head represents the first node
        // of the whole list. tail represents the last node of the whole list.
        // It doesn’t make sense for an individual node (Node class) to know the entire
        // list structure.
        // A Node only represents one single box in the linked list. It does not control
        // the whole linked list— it just stores data and next.
        // It does not control the whole linked list— it just stores data and next of a
        // single node.
        // static beacause there will be only one head and tail for the linked list
        public static Node head;
        public static Node tail;
    }

    public static void main(String[] args) {
        // if node class were non static then we would have to create an object of
        // BasicsOfLL class to create an object of Node class
        // BasicsOfLL ll = new BasicsOfLL();
        // Node head = ll.new Node(1); means: “create a Node object that’s tied to the ll object.
        // Node second = ll.new Node(2);
        // static inner class → can be created directly.
        // non-static inner class → must be created through an outer class object.
        Node.head = new Node(1);
        Node.head.next = new Node(2);
        Node.head.next.next = new Node(3);
        Node.head.next.next.next = new Node(4);
        Node.head.next.next.next.next = new Node(5);
        System.out.println(Node.head);
        Node temp = Node.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
