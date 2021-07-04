package problem139;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (dp[j - 1] && wordDict.contains(s.substring(j - 1, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String s = "aaaaaaa";
        List<String> dict = Arrays.asList("aaa", "aaaa");
        System.out.println(solution.wordBreak(s, dict));
    }

}
