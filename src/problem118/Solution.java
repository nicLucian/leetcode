package problem118;

import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = Collections.singletonList(1);
        for (int i = 1; i <= numRows; i++) {
            List<Integer> current = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    current.add(1);
                } else {
                    current.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = current;
            result.add(current);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
