public class MasterLL {
    // static node class for creating new nodes
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // global head and tail for the linked list
    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    // add first
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // if list is empty
        if (head == null) {
            head = newNode; // set head to new node
            tail = newNode; // set tail to new node as well since it's the only node
            return;
        }
        newNode.next = head; // link new node to head (contains address of first node)
        head = newNode; // new node becomes the new head
    }

    // add last
    public static void addLast(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add middle
    public static void addMiddle(int data, int index) {
        //dont increment size here or it will increase twice because it might increment in addFirst
        // indexing starts from 1
        if (index == 1) {
            addFirst(data);
            return;
        }
        // create a new node
        Node newNode = new Node(data);
        size++;
        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < index - 1; i++) { // or use while loop
            temp = temp.next;
        }
        // temp will become the prev node of the index
        if (temp.next == null) {
            tail = newNode;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first
    public static int removeFirst() {
        // if list is empty
        if (head == null) {
            System.out.println("List is empty");
            size = 0;
            return Integer.MIN_VALUE;
        }
        // if list has only one node
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public static int removeLast() {
        // if list is empty
        if (head == null) {
            System.out.println("List is empty");
            size = 0;
            return Integer.MIN_VALUE;
        }
        // if list has only one node
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // if list has more than one node
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

    // print linked list
    public static void display(Node head) {
        // base case
        if (head == null) {
            System.out.println("null");
            return;
        }
        // self work
        System.out.print(head.data + " -> ");
        // recursive call
        display(head.next);
    }

    //iterative search
    public static int iterativeSearch(int key) { // O(n)
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == key) { // Key found
                return position;
            }
            temp = temp.next;
            position++;
        }
        // key not found
        return -1;
    }

    //recursive search 
    public static int helper(Node head, int key) {

        // base case: if we reached the end of the list and didn't find the key
        if (head == null) {
            return -1;
        }

        // self work : If the current node contains the key, return index 0
        if (head.data == key) {
            return 0;
        }

        // Assume (without worrying how) that:
        // int index = helper(head.next, key);
        // magically gives you the correct index of key in the rest of the list.
        // This is the “leap of faith”:
        // recursive call: search for the key in the rest of the list
        int index = helper(head.next, key); // index of key in smaller list
        if (index == -1) {
            return -1;
        }

        // If found in the rest of the list, add 1 to the index (because current node is
        // before it)
        return index + 1;
    }

    public static int recursiveSearch(int key) {
        return helper(head, key);
    }

    //delete nth node from end
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
            head = head.next; //remove first
            return;
        }

        // find (size - n)th node
        int i = 1;
        int indexToFind = size - n;
        Node prev = head;
        while (i < indexToFind) {
            prev = prev.next; //prev will move forward until it reaches (size-n)th node
            i++;
        }

        // delete nth node from end
        prev.next = prev.next.next;
    }
    
    //check if a list is palindrome
    public static boolean isPalindrome(Node head) {
        // find middle 
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse second half
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        // compare reversed second half with first half
        Node second = prev;
        Node first = head;
        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public static void main(String[] args) {
        addFirst(1);
        addLast(2); 
        addLast(3); 
        addMiddle(10, 1);
        display(head);
        System.out.println("Size of the linked list: " + size);
        removeFirst();
        display(head);
        removeLast();
        display(head);
        System.out.println("Key found at position: " + iterativeSearch(2));
        System.out.println("Key found at position: " + recursiveSearch(10));
        addLast(3);
        addLast(4);
        addLast(5);
        display(head);
        deleteNthFromEnd(2);
        display(head);
    }
}