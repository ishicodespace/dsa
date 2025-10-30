package stack;

import java.util.Stack;

public class PushAtBottomOfStack {
    //brute force: using an auxiliary stack
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack.push(data);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    //optimal: using recursion no extra stack
    public static void pushAtBottomOfStack(Stack<Integer> stack, int data) {
        // base case
        if (stack.isEmpty()) {
            stack.push(data); // push data at bottom
            return;
        }
        // remove elements until stack is empty (going up the implicit call stack)
        int top = stack.pop(); // self work: pop
        pushAtBottomOfStack(stack, data); // recursive call: Each call removes the top element and delegates the rest of
                                          // the work (inserting data at the bottom of the remaining smaller stack) to
                                          // the recursive call.
        // while coming down the implicit call stack, push the elements back
        stack.push(top); // self work: push
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // pushAtBottomOfStack(stack, 4);
        pushAtBottom(stack, 5);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
// SMALLER PROBLEM EXPLANATION:
// Let’s take an example stack:
// Top →[3,2,1]
// and we want to insert 4 at the bottom.
// We pop 3 from the stack. //self work
// Now the smaller stack is [2,1].
// Now we ask recursion to handle the smaller problem:
// pushAtBottomOfStack([2, 1], 4)
// We assume (the recursive leap of faith) that this call will correctly insert
// 4 at the bottom of [2, 1].
// Once that’s done, we simply push back 3 on top of the result. //self work
// So, in essence, at each step:
// The stack becomes smaller by one element (the top element you popped).
// You ask recursion to solve the same problem on that smaller stack and assume that it will correctly insert the data at the bottom.
// After the recursive call returns, you push back the top element you had popped earlier.