package problem40;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> lineIndex = new ArrayList<>();
        List<List<Integer>> container = new ArrayList<>();
        List<Integer> noDup = removeDuplicate(candidates);

        System.out.println(noDup);
        backtrace(noDup, lineIndex, container, target, 0);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> line : container) {
            List<Integer> resultLine = new ArrayList<>();
            for (Integer index : line) {
                resultLine.add(noDup.get(index));
            }
            result.add(resultLine);
        }
        return result;
    }

    private List<Integer> removeDuplicate(int[] candidates) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : candidates) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return new ArrayList<>(map.keySet());
    }

    private void backtrace(List<Integer> candidates, List<Integer> lineIndex, List<List<Integer>> result, int target, int begin) {
        int sum = sum(lineIndex, candidates);
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(lineIndex));
            return;
        }

        for (int i = begin; i < candidates.size(); i++) {
            Integer index = Integer.valueOf(i);
            if (lineIndex.contains(index)) {
                continue;
            }
            lineIndex.add(index);
            backtrace(candidates, lineIndex, result, target, i);
            lineIndex.remove(index);
        }
    }

    private int sum(List<Integer> index, List<Integer> candidates) {
        int sum = 0;
        for (int i : index) {
            sum += candidates.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidate = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(solution.combinationSum2(candidate, 8));
    }
}
