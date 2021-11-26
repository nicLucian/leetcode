package problem74;

import java.util.Arrays;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int height = matrix.length;
        int targetLine = height - 1;
        for (int i = 0; i < height; i++) {
            if (matrix[targetLine][0] <= target) {
                break;
            }
            targetLine--;
        }
        if (targetLine < 0) {
            targetLine = 0;
        }
        return Arrays.binarySearch(matrix[targetLine], target) >= 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(solution.searchMatrix(matrix, 3));
    }
}
