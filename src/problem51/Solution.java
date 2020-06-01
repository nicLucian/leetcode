package problem51;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int[][] board;
    private List<List<String>> solutions;
    private int n;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solveNQueens(4);
        System.out.println(solution.solutions);
    }

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        solutions = new ArrayList<>();
        this.n = n;
        queen(0);
        return solutions;
    }

    private void queen(int row) {
        //结束条件
        if (row == n) {
            addSolutions();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isValid(row, col)) {
                continue;
            }
            //做选择
            board[row][col] = 1;
            //递归
            queen(row + 1);
            //撤销选择
            board[row][col] = 0;
        }
    }

    private boolean isValid(int row, int col) {
        //正上
        for (int j = row; j >= 0; j--) {
            if (board[j][col] == 1) {
                return false;
            }
        }
        //左上
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        //右上
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private void addSolutions() {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append(board[i][j] == 0 ? "." : "Q");
            }
            solution.add(stringBuilder.toString());
        }
        solutions.add(solution);
    }
}
