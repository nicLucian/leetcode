package problem215;

import java.util.Arrays;

class PartitionSolution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length;
        int index = 0;
        int target = k -1;
        while (true) {
            index = partition(nums, left, right);
            if (index == target) {
                break;
            } else if (index < target){
                left = index + 1;
            } else {
                right = index;
            }
        }
        return nums[target];
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > pivot) {
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, j, left);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
