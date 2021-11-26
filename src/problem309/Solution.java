package problem309;

import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] =  i - 2 > 0 ? Math.max(dp[i - 1][0], dp[i - 2][1] + prices[i]) : dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        for (int[] array : dp) {
            System.out.println(Arrays.toString(array));
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}
