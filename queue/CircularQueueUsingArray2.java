package queue;

public class CircularQueueUsingArray2 {

    static class Queue {
        static int arr[] = new int[5];
        static int size = 0;
        static int front = -1; // front also cause it wont always be at 0th index
        static int rear = -1;

        public static void add(int data) throws Exception {
            // case 1: queue is full
            if (size == arr.length) {
                throw new Exception("Queue is full");
            }
            // case 2: queue is empty
            else if (size == 0) {
                front = rear = 0;
                arr[rear] = data;
            }
            // case 3: rear hasnt reached end of array
            else if (rear < arr.length - 1) { // normal case
                arr[++rear] = data;
            }
            // case 4: rear is at end of array but there is space in front
            else if (rear == arr.length - 1) {
                rear = 0; // bring rear to 0th index
                arr[0] = data;
                size++;
            }
        }

        public static int remove() {
            // case 1: queue is empty
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int val = arr[front];
                if (front == arr.length - 1) { // front is at end of array
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return val;
            }
        }

        public static int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return arr[front];
            }
        }

        public static void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                // rear has crossed front -> rear < front
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        public static void main(String[] args) throws Exception {
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            display();
            System.out.println("Removed: " + remove());
            System.out.println("Peek: " + peek());
            display();
        }
    }
}