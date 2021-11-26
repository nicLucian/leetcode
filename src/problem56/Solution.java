package problem56;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1, 3}, {2, 6}, {15, 18}, {8, 10}, };
        solution.merge(intervals);
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(Arrays.toString(intervals[i]));
        }
        return null;
=======
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
>>>>>>> 4ae1388d0fa0cecef29b163fc695581fe35deb4e
    }
}
