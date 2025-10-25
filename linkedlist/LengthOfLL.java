//to find size you can also define a static variable size and increment it whenever u add a node
public class LengthOfLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int lengthRecursively(Node head, int count) {
        if (head == null) {
            return count;
        }
        count++;
        return lengthRecursively(head.next, count);
    }
    
    public static int lengthIteratively(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(lengthRecursively(a, 0));
        System.out.println(lengthIteratively(a));
    }
}
