package queue;

public class QueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // check if queue is emmpty
        public static boolean isEmpty() {
            return rear == -1;
        }

        //enqueue
        public static void add(int data) {
            //check if queue is full
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            //front is always at 0th index
            rear=rear+1; //if rear was -1 it becomes 0
            arr[rear] = data;
        }

        //dequeue
        public static int remove() {
            //check if queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            //to remove shift all the elements to left by 1
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //peek 
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
