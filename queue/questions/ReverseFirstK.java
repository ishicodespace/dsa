package queue.questions;

import java.util.*;

public class ReverseFirstK {
    public static void reverseK(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= k; i++) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for (int i = k + 1; i < q.size(); i++) {
            int element = q.remove();
            q.add(element);
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseK(q, 2);
        System.out.println(q);
    }
}
