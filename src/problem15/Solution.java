package problem15;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, 0, 1, 1, 2};
        System.out.println(solution.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int startIndex = i + 1;
            int endIndex = nums.length - 1;
            while (startIndex < endIndex) {
                int sum = nums[startIndex] + nums[endIndex];
                if (sum == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[startIndex]);
                    list.add(nums[endIndex]);
                    result.add(list);
                    startIndex++;
                }
                if (sum < target) {
                    startIndex++;
                }
                if (sum > target) {
                    endIndex--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
