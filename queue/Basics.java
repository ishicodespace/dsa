package queue;

import java.util.*;

public class Basics {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public static Node head;
        public static Node tail;
        static int size = 0;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop() {
            if (head == null) {
                return -1;
            }
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                temp = temp.next;
                prev = temp;
            }
            int data = temp.data;
            prev.next = null;
            return data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
