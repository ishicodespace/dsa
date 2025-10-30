package stack;
import java.util.*;
public class PalindromeLL {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('D');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ll.size(); i++) {
            stack.push(ll.get(i));
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != ll.remove()) {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Is a Palindrome");
    }

    }