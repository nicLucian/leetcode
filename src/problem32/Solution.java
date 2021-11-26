package problem32;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
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
                }
            }
        }
        return maxLength;
    }
}
