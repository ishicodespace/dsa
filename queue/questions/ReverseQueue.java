package queue.questions;
import java.util.*;
public class ReverseQueue {
    //using recursion
    public static void reverse(Queue<Integer> q) {
        //base case
        if (q.size() == 0) {
            return;
        }
        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    //using stack
    public static void stackReverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (q.size() > 0) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        stackReverse(q);
        System.out.println(q);
    }
}
