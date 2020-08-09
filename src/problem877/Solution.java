package problem877;

class Solution {
    private static class Pair {
        int first;
        int second;
    }

    public boolean stoneGame(int[] piles) {
        Pair[][] dp = new Pair[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++) {
            for (int j = 0; j < piles.length; j++) {
                dp[i][j] = new Pair();
                if (i == j) {
                    dp[i][j].first = piles[i];
                    dp[i][j].second = 0;
                }
            }
        }
        for (int l = 1; l < piles.length; l++) {
            for (int i = 0; i < piles.length - l; i++) {
                int j = i + l;
                int left = piles[i] + dp[i+1][j].second;
                int right = piles[j] + dp[i][j-1].second;
                if (left > right) {
                    dp[i][j].first = left;
                    dp[i][j].second = dp[i+1][j].first;
                } else {
                    dp[i][j].first = right;
                    dp[i][j].second = dp[i][j-1].first;
                }
            }
        }
        return dp[0][piles.length - 1].first - dp[0][piles.length - 1].second > 0;
    }
}
