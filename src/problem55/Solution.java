package problem55;

class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] && (i - j) <= nums[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,3,1,1,4};
        System.out.println(solution.canJump(nums));

        int[] nums1 = {3,2,1,0,4};
        System.out.println(solution.canJump(nums1));
    }
}
