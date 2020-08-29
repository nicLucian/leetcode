package problem474;

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][][] dp = new int[m + 1][n + 1][length + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 1; k <= length; k++) {
                    String str = strs[k - 1];
                    int[] count = count(str);
                    if (i < count[0] || j < count[1]) {
                        dp[i][j][k] = dp[i][j][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - count[0]][j - count[1]][k - 1] + 1,
                                dp[i][j][k - 1]);
                    }
                }
            }
        }
        return dp[m][n][length];
    }

    private int[] count(String source) {
        int[] count = new int[2];
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == '0') {
                count[0] ++ ;
            } else {
                count[1] ++;
            }
        }
        return count;
    }
}
