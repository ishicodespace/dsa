package tree.basics;

public class Implementation {
    public static class Node {
        int data;
        Node left; // null
        Node right; // null

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // creating tree nodes
        Node root = new Node(1);
        Node a = new Node(2); // new node which has data and left and right node
        Node b = new Node(3);

        // connecting root with left and right child
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        b.left = c;
        Node d = new Node(5);
        b.right = d;

        // root(1)
        // / \
        // a(2) b(3)
        // / \
        // c(4) d(5)

    }
}
