package problem1143;

import java.util.Arrays;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text1.length() == 0) {
            return 0;
        }
        if (text2 == null || text2.length() == 0) {
            return 0;
        }
        int length1 = text1.length() + 1;
        int length2 = text2.length() + 1;
        int[][] dp = new int[length1][length2];
        for (int i = 0; i < length1; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < length2; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < length1; i++) {
            for (int j = 1; j < length2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[length1 - 1][length2 - 1];
    }
}
