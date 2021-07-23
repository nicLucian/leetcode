package problem494;

public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        return findTarget(nums, nums.length - 1, S);
    }

    private int findTarget(int[] nums, int i, int S) {
        if (i == 0) {
            if (nums[0] == 0 && S == 0) {
                return 2;
            }
            return ((nums[0] == S) || (nums[0] == -S)) ? 1 : 0;
        }
        return findTarget(nums, i - 1, S - nums[i]) + findTarget(nums, i - 1, S + nums[i]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(solution.findTargetSumWays(nums, 3));
    }
}
