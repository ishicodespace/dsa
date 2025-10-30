package stack;

import java.util.*;

public class DuplicateParentheses {
    public static boolean doubleParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        //traverse the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing bracket
            if (ch == ')') {
                int count = 0;
                //pop element here only instead of checking peek and later popping
                while(stack.pop() != '(') { //until an opening bracket is found
                        count++;
                    }
                if (count < 1) {
                    return true;
                }
                // else {
                //     stack.pop(); //opening bracket pop
                // }
            }
            //opening bracket and other characters
            else{
                stack.push(ch);
            }
        }
       return false;
    }

    public static void main(String[] args) {
        //input has only valid strings
        System.out.println(doubleParentheses("(((a+b)+(c+d)))")); // true
        System.out.println(doubleParentheses("(a+b)+(c+d)")); // false
    }
}
