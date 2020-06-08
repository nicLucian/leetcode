package problem47;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> trace = new LinkedList<>();
        premute(nums, trace, result);
        return result;
    }

    private void premute(int[] nums,LinkedList<Integer> trace, List<List<Integer>> result) {
        if (trace.size() == nums.length) {
            List<Integer> target = new ArrayList<>();
            for (Integer integer : trace) {
                target.add(nums[integer]);
            }
            if (!result.contains(target)) {
                result.add(target);
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (trace.contains(i)) {
                continue;
            }
            trace.add(i);
            premute(nums, trace, result);
            trace.removeLast();
        }
    }
}
