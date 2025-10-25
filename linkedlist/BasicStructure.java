
//here Node class can be used anywhere because it is not inside any other class
class Node {
    int data;
    Node next; // reference variable to point to another node object
    // next is not an object itself -> it’s a reference variable that can point to
    // an object of type Node.

    public Node(int data) {
        this.data = data;
        this.next = null;
        // we assume that when a node is created, it does not point to any other node
    }
}


public class BasicStructure {
    public static void main(String[] args) {

        // Object = the actual Node created with new Node()
        // Reference = the variable that stores the memory address of that object.
        // Object = a house
        // Reference variable = the house address
        // next = the address written on paper, not the house itself.
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        a.next = b;
        System.out.println(a.next); // gives the address of node b
        System.out.println(b); // gives the address of node b
        System.out.println(c); // gives the address of node c
        System.out.println(d); // gives the address of node d

        System.out.println(a.next.next.next.next.data);
    }
}
