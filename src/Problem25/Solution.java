package Problem25;

import java.util.Arrays;
import java.util.Objects;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,3};
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int fastIndex = 1;
        int slowIndex = 0;
        int count = 1;
        while (fastIndex < nums.length){
            if (nums[slowIndex] != nums[fastIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
                fastIndex++;
                count++;
            } else {
                fastIndex++;
            }
        }
        return count;
    }
}
