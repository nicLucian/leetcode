package problem120;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = 0;
        for (List<Integer> line : triangle) {
            length += line.size();
        }
        int[] dp = new int[length];
        List<Integer> lastLine = triangle.get(triangle.size() - 1);
        int lastSize = lastLine.size();
        for (int i = 0; i < lastSize; i++) {
            dp[length - i - 1] = lastLine.get(lastSize - i - 1);
        }

        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> line = triangle.get(i);
            for (int j = 0; j < line.size(); j++) {
                dp[index(i, j)] = line.get(j) + Math.min(dp[index(i + 1, j)], dp[index(i + 1, j + 1)]);
            }
        }
        return dp[0];
    }

    private int index(int i, int j) {
        int sum = 0;
        for (int k = 0; k <= i; k++) {
            sum += k;
        }
        sum += j;
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> line1 = Arrays.asList(2);
        List<Integer> line2 = Arrays.asList(3, 4);
        List<Integer> line3 = Arrays.asList(6, 5, 7);
        List<Integer> line4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangle = Arrays.asList(line1, line2, line3, line4);

        Solution solution = new Solution();
        System.out.println(solution.minimumTotal(triangle));
    }
}
