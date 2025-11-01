package queue;

public class CircularQueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int front; // front also cause it wont always be at 0th index
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // check if queue is emmpty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // check if queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public static void add(int data) {
            // check if queue is full
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // add first element
            if (front == -1) {
                front = 0; // first element added
            }
            // front is always at 0th index
            rear = (rear + 1) % size; // if rear was -1 it becomes 0
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            // check if queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            // last element removed
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.remove();
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}



