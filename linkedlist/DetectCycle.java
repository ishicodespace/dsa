public class DetectCycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle detected
    }

    public static void removeCycle(Node head) {
        // detect if cycle is present
        // using floyd's cycle detection algorithm
        Node slow = head;
        Node fast = head;
        boolean isCyclePresent = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCyclePresent = true;
            }
        }
        if (isCyclePresent==false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        // find the start of the cycle
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //after this loop slow and fast both are at meeting point
        // remove cycle by setting the next of the node before fast to null
        prev.next = null;
    }

    public static void main(String[] args) {
        DetectCycle.head = new Node(1);
        DetectCycle.head.next = new Node(2);
        DetectCycle.head.next.next = new Node(3);
        DetectCycle.head.next.next.next = new Node(4);
        DetectCycle.head.next.next.next.next = head; // creating a cycle for testing
        // 1 -> 2 -> 3 -> 4 -> 2
        System.out.println(isCycle(head));
        removeCycle(head);
        System.out.println(isCycle(head));
    }
}
