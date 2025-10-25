public class DeleteNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static void deleteNthFromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // if n == size, delete head
        if (n == size) {
            head = head.next;
            return;
        }

        // find (size - n)th node
        int i = 1;
        int toFind = size - n;
        Node prev = head;
        while (i < toFind) {
            prev = prev.next;
            i++;
        }

        // delete nth node from end
        prev.next = prev.next.next;
    }
}
