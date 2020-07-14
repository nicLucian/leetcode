package problem1035;

class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int length1 = A.length;
        int length2 = B.length;
        int[][] dp = new int[length1 + 1][length2 + 1];
        for (int i = 0; i < length1 + 1; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < length2 + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < length1 + 1; i++) {
            for (int j = 1; j < length2 + 1; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[length1][length2];
    }
}
