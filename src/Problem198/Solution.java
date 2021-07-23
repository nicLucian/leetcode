package Problem198;

public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        if (length == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7, 9, 3, 1};
        Solution solution = new Solution();
        System.out.println(solution.rob(nums));
    }
}
