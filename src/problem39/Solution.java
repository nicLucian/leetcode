package problem39;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        backtrace(candidates, target, line, result, 0);
//        System.out.println(result);
        return result;
    }

    private void backtrace(int[] candidates, int target, List<Integer> line, List<List<Integer>> result, int begin) {
        int sum = sum(line);
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(line));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            line.add(candidates[i]);
            backtrace(candidates, target, line, result, i);
            line.remove(Integer.valueOf(candidates[i]));
        }
    }

    private int sum(List<Integer> digits) {
        int sum = 0;
        for (int i : digits) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidate = {2,3,5};
        System.out.println(solution.combinationSum(candidate, 8));
    }
}
