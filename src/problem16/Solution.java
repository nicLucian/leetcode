package problem16;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int sumTarget = target - nums[i];
            int startIndex = i + 1;
            int endIndex = nums.length - 1;
            while (startIndex < endIndex) {
                int sum = nums[startIndex] + nums[endIndex];
                int currentThreeSum = nums[i] + nums[startIndex] + nums[endIndex];
                if (sum <= sumTarget) {
                    startIndex ++;
                }
                if (sum > sumTarget) {
                    endIndex --;
                }
                closestSum = Math.abs(currentThreeSum - target) < Math.abs(closestSum - target) ? currentThreeSum : closestSum;
            }
        }
        return closestSum;
    }

}
