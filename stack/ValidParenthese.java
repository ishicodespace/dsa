package stack;

import java.util.*;

public class ValidParenthese {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //check for opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                //closing bracket
                if (stack.isEmpty()) { // eg "])))))"
                    return false;
                }
                if (stack.peek() == '(' && ch == ')'
                        || stack.peek() == '[' && ch == ']'
                        || stack.peek() == '{' && ch == '}') {
                    stack.pop();
                }
                //no successful pairs
                else {
                    return false;
                }
            }
        }
        //maybe some opening brackets left in stack so check if it is empty
            if (stack.empty())
                return true;
            return false;
    }

    public static void main(String[] args) {
        String str = "({[]}))))";
        System.out.println(isValid(str));
    }
}
