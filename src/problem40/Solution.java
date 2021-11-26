package problem40;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
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
=======

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
>>>>>>> 4ae1388d0fa0cecef29b163fc695581fe35deb4e
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
<<<<<<< HEAD
        int[] candidate = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(solution.combinationSum2(candidate, 8));
=======
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(solution.combinationSum2(candidates, 8));
>>>>>>> 4ae1388d0fa0cecef29b163fc695581fe35deb4e
    }
}
