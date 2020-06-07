package problem46;

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
            result.add(new LinkedList<>(trace));
            return;
        }
        for (Integer num : nums) {
            if (trace.contains(num)) {
                continue;
            }
            trace.add(num);
            premute(nums, trace, result);
            trace.removeLast();
        }
    }
}
