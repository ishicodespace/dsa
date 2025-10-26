package stack;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottomOfStack(Stack<Integer> stack, int data) {
        // base case
        if (stack.isEmpty()) {
            stack.push(data); // push data at bottom
            return;
        }
        // remove elements until stack is empty (going up the implicit call stack)
        int top = stack.pop();
        pushAtBottomOfStack(stack, data);
        // while coming down the implicit call stack, push the elements back
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        //base case
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop(); //self work
        reverseStack(stack); //recursive call
        pushAtBottomOfStack(stack, top); //self work: pushing element back into the stack but at the bottom

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        //3 2 1
        reverseStack(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

// The smaller problem is:“ Reverse the remaining stack after removing one element from the top.”
// Each recursive step makes the problem smaller by reducing the number of elements in the stack.
// For example:
// If the stack is [3,2,1], pop 3 → smaller problem is reversing[2,1].

// Recursive Leap of Faith:
// You take a leap of faith and assume that
// reverseStack(stack) will correctly reverse the smaller stack.
// You don’t worry about how it does it...you trust recursion.
// So when you get the control back, you just need to handle the top element you popped earlier which you put at the bottom (using pushAtBottomOfStack).