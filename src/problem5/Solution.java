package problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    List<Integer> source = new ArrayList<>();
                    source.add(nums[i]);
                    source.add(nums[left]);
                    source.add(nums[right]);
                    if (!result.contains(source)) {
                        result.add(source);
                    }
                    left++;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> source1 = Arrays.asList(-1, -1, 2);
        List<Integer> source2 = Arrays.asList(-1, 0, 1);
        expected.add(source1);
        expected.add(source2);

        assertEquals(expected, solution.threeSum(nums));
    }
}
