package Problem77;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combine(n, k);
        for (List<Integer> level : result) {
            System.out.print("[");
            for (Integer i : level) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(1, n, k, new ArrayList<>(), result);
        return result;
    }

    public void combine(int start, int n, int k, List<Integer> level, List<List<Integer>> result) {
        if (level.size() == k) {
            result.add(new ArrayList<>(level));
            return;
        }

        for (int i = start; i <= n; i++) {
            if (!level.contains(i)) {
                level.add(i);
                combine(i + 1, n, k, level, result);
                level.remove(level.size() - 1);
            }
        }
    }
}
