package problem300;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int dpValue = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dpValue = Math.max(dpValue, dp[j]);
                }
            }
            dp[i] = dpValue + 1;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
