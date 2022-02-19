package problem130;

public class Solution {
    private int[][] dirs = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };
    private boolean[][] visited;

    public void solve(char[][] board) {
        visited = new boolean[board.length][board[0].length];
        //第1行和最后一行
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[board.length - 1][j] == 'O') {
                dfs(board, board.length - 1, j);
            }
        }
        //第1列和最后1列
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][board[0].length - 1] == 'O') {
                dfs(board, i, board[0].length - 1);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (visited[i][j]) {
            return;
        }
        if (board[i][j] == 'O') {
            board[i][j] = 'Y';
        }
        visited[i][j] = true;
        for (int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x < 0 || x >= board.length) {
                continue;
            }
            if (y < 0 || y >= board[0].length) {
                continue;
            }
            if (board[x][y] == 'O') {
                dfs(board, x, y);
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        Solution solution = new Solution();
        solution.solve(board);
    }
}
