public class SearchInLL {
    public class DeleteFirst {
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
        public static int size;

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
    }
}
