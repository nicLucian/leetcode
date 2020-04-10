package problem34;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,7,7,7, 8,8,10};
        System.out.println(Arrays.toString(solution.searchRange(nums, 6)));
        System.out.println(Arrays.toString(solution.searchRange(nums, 8)));
        System.out.println(Arrays.toString(solution.searchRange(nums, 10)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};
        int low =  findExtremeIndex(nums, target, true);
        if (low == nums.length || nums[low] != target) {
            return index;
        }
        int high = findExtremeIndex(nums, target, false) - 1;
        index[0] = low;
        index[1] = high;
        return index;
    }

    private int findExtremeIndex(int[] nums, int target, boolean isLeft) {
        int startIndex = 0;
        int endIndex = nums.length;
        while (startIndex < endIndex) {
            int middle = (startIndex + endIndex) / 2;
            if (nums[middle] > target || isLeft && nums[middle] == target) {
                endIndex = middle;
            } else {
                startIndex = middle + 1;
            }
        }
        return startIndex;
    }
}
