package Algorithms.Easy;

import java.util.Stack;

/**
 * Created by Wags on 3/21/17.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.print(isValid("[][]"));
    }

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     *
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '{'){
                stack.push('}');
            } else if (c == '['){
                stack.push(']');
            } else if (c == '('){
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
