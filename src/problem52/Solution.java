package problem52;

class Solution {
    private int mSolutions;
    private int[][] mBoard;

    public int totalNQueens(int n) {
        mBoard = new int[n][n];
        backtrace(0, n);
        return mSolutions;
    }

    private void backtrace(int row, int n) {
        if (row == n) {
            mSolutions++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isValid(row, col, n)) {
                continue;
            }
            mBoard[row][col] = 1;
            backtrace(row + 1, n);
            mBoard[row][col] = 0;
        }
    }

    private boolean isValid(int row, int col, int n) {
        for (int i = row; i >= 0; i--) {
            if (mBoard[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--,j--) {
            if (mBoard[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (mBoard[i][j] == 1) {
                return false;
            }
        }
        return true;
    }


}
