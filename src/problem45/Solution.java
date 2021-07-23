package problem45;

import java.util.Arrays;

class Solution {

    public int jump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[length - 1] = 0;
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
            } else {
                int currentMin = length;
                for (int j = i; j < i + nums[i] && j < length - 1; j++) {
                    currentMin = Math.min(currentMin, dp[j + 1]);
                }
                if (currentMin == Integer.MAX_VALUE) {
                    dp[i] = Integer.MAX_VALUE;
                } else {
                    dp[i] = currentMin + 1;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(solution.jump(nums));
    }
}
