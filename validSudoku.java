class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (isSudoko(board, i, j, board[i][j]) == false) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isSudoko(char[][] board, int i, int j, char num) {
        for (int r = 0; r < 9; r++) {
            if (r != i && board[r][j] == num) {
                return false;
            }
        }
        
        for (int c = 0; c < 9; c++) {
            if (c != j && board[i][c] == num) {
                return false;
            }
        }
        int rr = (i/3)*3;
        int cc = (j/3)*3;
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++) {
                int ii = rr + r;
                int jj = cc + c;
                if (ii != i && jj != j && board[ii][jj] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}