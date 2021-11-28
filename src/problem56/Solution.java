package problem56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (ints1, ints2) -> ints1[0] - ints2[0]);
        int[][] result = new int[intervals.length][2];
        int currentIndex = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (currentIndex == -1 || result[currentIndex][1] < intervals[i][0]) {
                result[++currentIndex][0] = intervals[i][0];
                result[currentIndex][1] = intervals[i][1];
            } else {
                result[currentIndex][1] = Math.max(intervals[i][1], result[currentIndex][1]);
            }
        }
        return Arrays.copyOf(result, currentIndex + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {
                {1, 4},
                {2, 3},
                {8, 10},
                {15, 18}
        };

        for (int[] interval : solution.merge(intervals)) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
