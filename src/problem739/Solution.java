package problem739;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int currentTemperature = temperatures[i];
            while (!stack.isEmpty() && currentTemperature > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solution.dailyTemperatures(temperatures)));
    }
}
