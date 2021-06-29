package problem91;

class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                char preCh = s.charAt(i - 1);
                if (preCh == '0') {
                    return 0;
                } else if (preCh == '1' || preCh == '2') {
                    dp[i] = (i - 2 > 0) ? dp[i - 2] : 1;
                } else {
                    return 0;
                }
            } else {
                int str = Integer.parseInt(s.substring(i - 1, i + 1));
                if (str <= 26) {
                    if (s.charAt(i - 1) == '0') {
                        dp[i] = dp[i - 1];
                    } else {
                        dp[i] = dp[i - 1] + 1;
                    }
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDecodings("201"));
    }
}
