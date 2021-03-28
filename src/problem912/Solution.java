package problem912;

import java.util.Arrays;

public class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int partition = partition(nums, left, right);
        quickSort(nums, left, partition - 1);
        quickSort(nums, partition + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int targetIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                targetIndex++;
                swap(nums, i, targetIndex);
            }
        }
        swap(nums, left, targetIndex);
        return targetIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2, 5, 4};
        solution.sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
