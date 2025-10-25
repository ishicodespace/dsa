public class DeleteLast {
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
    public static int size = 0;

    public static int removeLast() {
        // if list is empty
        if (head == null) {
            System.out.println("List is empty");
            size=0;
            return Integer.MIN_VALUE;
        }
        // if list has only one node
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //if list has more than one node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
}