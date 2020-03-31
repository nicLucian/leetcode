package problem20;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid(")]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isLeft(ch)) {
                stack.push(ch);
            }
            if (isRight(ch)) {
                if (stack.isEmpty() || !isPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    private boolean isLeft(char ch) {
        return ch == '('
                || ch == '['
                || ch == '{';
    }

    private boolean isRight(char ch) {
        return ch == ')'
                || ch == ']'
                || ch == '}';
    }

    private boolean isPair(char source, char target) {
        return (source == '(' && target == ')')
                || (source == '[' && target == ']')
                || (source == '{' && target == '}');
    }
}
