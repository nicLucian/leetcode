package problem5;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        for (int strLength = 2; strLength <= length; strLength++) {
            for (int i = 0; i < length; i++) {
                //j - i =
                int j = strLength + i - 1;
                if (j >= length) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    if (strLength == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (strLength > maxLength) {
                        startIndex = i;
                        endIndex = j;
                        maxLength = strLength;
                    }
                }
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        LongestPalindrome palindrome = new LongestPalindrome();
        String s = "ccc";
        System.out.println(palindrome.longestPalindrome(s));
    }
}
