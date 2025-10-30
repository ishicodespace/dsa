package stack;

import java.util.*;

public class NextGreaterRight {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        //we will store indexes in stack not values
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];
        // traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }
            // push the current element to stack
            stack.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
// We remove (pop) any smaller or equal elements from the stack — they can’t be "next greater" for anyone to their left.
// The element currently on top of the stack (if any) is the next greater element for the current element.

//other questions
//Next Greater Left -> reverse for loop
//Next Smaller Right -> change <= to >=
//Next Smaller Left -> reverse for loop and change <= to >=