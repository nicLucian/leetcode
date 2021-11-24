package problem40;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> candidateIndexes = new ArrayList<>();
        backTrace(candidates, target, new ArrayList<>(), 0, candidateIndexes);
        System.out.println(candidateIndexes);
        for (List<Integer> lines : candidateIndexes) {
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, candidates[lines.get(i)]);
            }
        }
        return candidateIndexes;

    }

    private void backTrace(int[] candidates, int target, List<Integer> indexes, int start, List<List<Integer>> result) {
        int sum = sum(candidates, indexes);
        if (sum == target) {
            result.add(new ArrayList<>(indexes));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (!indexes.contains(i)) {
                indexes.add(i);
                backTrace(candidates, target, indexes, i + 1, result);
                indexes.remove(Integer.valueOf(i));
            }
        }
    }

    private int sum(int[] candidates, List<Integer> indexes) {
        int sum = 0;
        for (int index : indexes) {
            sum += candidates[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(solution.combinationSum2(candidates, 8));
    }
}
