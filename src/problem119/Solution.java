package problem119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = Collections.singletonList(1);
        for (int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> current = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    current.add(1);
                } else {
                    current.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = current;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(3));
    }


}
