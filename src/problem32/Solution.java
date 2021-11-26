package problem32;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
<<<<<<< HEAD
        Stack<Character> stack = new Stack<>();
        int currentIndex = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    maxLength = Math.max(maxLength, i - currentIndex);
                    currentIndex = i + 1;
=======
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(i);
            } else if (currentChar == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i);
>>>>>>> 4ae1388d0fa0cecef29b163fc695581fe35deb4e
                }
            }
        }
        return maxLength;
    }
<<<<<<< HEAD
=======

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = ")))()";
        System.out.println(solution.longestValidParentheses(s));
    }
>>>>>>> 4ae1388d0fa0cecef29b163fc695581fe35deb4e
}
