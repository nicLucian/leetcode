package problem44;

import java.util.Arrays;

class Solution {

    public boolean isMatch(String text, String p) {
        String pattern = removeDuplicateStar(p);
        int textLength = text.length();
        int patternLength = pattern.length();
        boolean[][] dp = new boolean[textLength + 1][patternLength + 1];
        dp[0][0] = true;

        for (int j = 1; j < patternLength + 1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = true;
            } else {
                break;
            }
        }

        for (int i = 1; i <= textLength; i++) {
            char textChar = text.charAt(i - 1);
            for (int j = 1; j <= patternLength; j++) {
                char patternChar = pattern.charAt(j - 1);
                if (patternChar == '?' || patternChar == textChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (patternChar == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                System.out.println("i = " + i + " j = " + j + " textChar = " + textChar + " patternChar = " + patternChar + " dp = " + dp[i][j]);
            }
        }
        for (int i = 0; i < textLength + 1; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[textLength][patternLength];
    }

    String removeDuplicateStar(String pattern) {
        StringBuilder patternBuilder = new StringBuilder();
        if (pattern.isEmpty()) {
            return patternBuilder.toString();
        }
        patternBuilder.append(pattern.charAt(0));
        for (int i = 1; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '*' && pattern.charAt(i) == pattern.charAt(i - 1)) {
                continue;
            }
            patternBuilder.append(pattern.charAt(i));
        }
        return patternBuilder.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
