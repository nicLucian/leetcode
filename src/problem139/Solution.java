package problem139;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private boolean[] dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new boolean[s.length()];
        Set<String> dict = new HashSet<>(wordDict);
        return contains(0, s, dict);
    }

    private boolean contains(int start, String s, Set<String> wordDict) {
        if (start == s.length()) {
            return true;
        }
        if (dp[start]) {
            return true;
        }
        for (int i = start; i < s.length(); i++) {
            String subStr = s.substring(start, i + 1);
            if (wordDict.contains(subStr) && contains(i + 1, s, wordDict)) {
                dp[start] = true;
                return true;
            }
        }
        dp[start] = false;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaaaaaa";
        List<String> dict = Arrays.asList("aaaa", "aaa");
        System.out.println(solution.wordBreak(s, dict));
    }
}
