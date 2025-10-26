package stack;

import java.util.Stack;

public class ReverseString {
    public static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        // push all characters of string into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reversedStr = new StringBuilder();
        // pop all characters from stack and append to reversedStr
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        System.out.println(reversedStr);
    }

    public static void main(String args[]) {
        reverseString("habibi"); // output: ibihab
    }
}
