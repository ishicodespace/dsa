package stack;
import java.util.*;
public class DuplicateParentheses {
    public static boolean doubleParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ')' || ch != ']' || ch != '}') {
                stack.push(ch);
            }
            else {
                
            }
        }
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(doubleParentheses(str));
    }
}
