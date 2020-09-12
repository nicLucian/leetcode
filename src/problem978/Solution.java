package problem978;

class Solution {
    public int maxTurbulenceSize(int[] A) {
        int length = A.length;
        int[] dp = new int[length + 1];
        dp[0] = 0;
        if (length >= 1) {
            dp[1] = 1;
        }
        if (length >= 2) {
            dp[2] = A[0] == A[1] ? 1 : 2;
        }
        if (length >= 3) {
            for (int i = 3; i <= length; i++) {
                int left = A[i - 3];
                int mid = A[i - 2];
                int right = A[i - 1];
                boolean isCorrect = (left < mid && right < mid) || (left > mid && right > mid);
                dp[i] = isCorrect ? dp[i - 1] + 1 : right == mid ? 1 : 2;
            }
        }
        int result = 0;
        for (int i = 1; i <= length; i++) {
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }
}
