package problem22;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(2));
    }

    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        backTrace(parenthesis, "", 0, 0, n);
        return parenthesis;
    }

    private void backTrace(List<String> parenthesis, String current, int open, int close, int max) {
        if (current.length() == 2 * max) {
            parenthesis.add(current);
            return;
        }
        if (open < max) {
            backTrace(parenthesis, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backTrace(parenthesis, current + ")", open, close +1, max);
        }
    }
}
