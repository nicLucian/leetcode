package problem10;

import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {
        int textLength = s.length();
        int patternLength = p.length();

        boolean[][] dp = new boolean[textLength + 1][patternLength + 1];
        dp[0][0] = true;

        for (int j = 1; j <= patternLength; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }

        for (int i = 1; i <= textLength; i++) {
            char textChar = s.charAt(i - 1);
            for (int j = 1; j <= patternLength; j++) {
                char patternChar = p.charAt(j - 1);
                if (patternChar == '*') {
                    char charBeforeStar = p.charAt(j - 2);
                    boolean matchZeroTime = dp[i][j - 2];
                    boolean matchOneTime = dp[i - 1][j];
                    //需要匹配"*"号前面的字符
                    if (textChar == charBeforeStar || charBeforeStar == '.') {
                        dp[i][j] = matchZeroTime || matchOneTime;
                    } else {
                        dp[i][j] = matchZeroTime;
                    }
                } else {
                    if (textChar == patternChar || patternChar == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }
        for (int i = 0; i < textLength + 1; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[textLength][patternLength];
    }
}
