package stack;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check for opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // closing bracket
            else {
                if (stack.isEmpty()) { // eg. string has only closing "])))))"
                    return false;
                }
                // check for matching pairs
                if (stack.peek() == '(' && ch == ')'
                        || stack.peek() == '[' && ch == ']'
                        || stack.peek() == '{' && ch == '}') {
                    stack.pop();
                }
                // no successful pairs -> return false
                else {
                    return false;
                }
            }
        }
        // maybe some opening brackets left in stack so check if it is empty
        if (stack.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "(((({[]}))))";
        System.out.println(isValid(str));
    }
}
