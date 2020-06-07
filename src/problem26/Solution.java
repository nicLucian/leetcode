package problem26;

import java.util.Arrays;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [3,2,2,3], val = 3,
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {1};
        System.out.println(solution.removeElement(nums, 1));
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int tmp = 0;
        int count = nums.length;
        while (startIndex <= endIndex) {
            if (nums[startIndex] == val) {
                tmp = nums[endIndex];
                nums[endIndex] = nums[startIndex];
                nums[startIndex] = tmp;
                endIndex--;
                count--;
            } else {
                startIndex++;
            }
        }
        return count;
    }
}
