public class ReverseLL {
    public static class Node {
        Node next;
        int data;

        public static Node head;
        public static Node tail;
        public static void Reverse(Node head) {
            Node prev = null; //prev of head is null
            Node curr = tail=head; //right to left assignment
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head=prev;
            }
        }
}
