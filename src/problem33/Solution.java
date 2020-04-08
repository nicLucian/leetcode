package problem33;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1};
        System.out.println(solution.search(nums, 1));
        System.out.println(solution.search(nums, 2));
        System.out.println(solution.search(nums, 3));
//        System.out.println(solution.search1(nums, 1));
        System.out.println(solution.search(nums, 4));
        System.out.println(solution.search(nums, 5));
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < nums[end]) {//右边有序
                if (nums[middle] < target && target <= nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {//左边有序
                if (nums[start] <= target && target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
