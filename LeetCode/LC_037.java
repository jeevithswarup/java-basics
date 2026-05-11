public class LC_037 {
    public void solveSudoku(char[][] board) {

        isValidSudoku(board);
    }

    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int cols = 0; cols < 9; cols++) {
                char ch = board[row][cols];
                if (ch == '.') {

                    for (char i = '0'; i < '9'; i++) {

                        if (isValid(board, row, cols, i)) {
                            board[row][cols] = i;

                            if (isValidSudoku(board)) {
                                return true;
                            }
                            board[row][cols] = '.';
                        }
                    }
                    return false;

                }

            }
        }

        return true;

    }

    public boolean isValid(char[][] board, int row, int cols, char i) {

        for (int j = 0; j < 9; j++) {
            if (board[row][j] == i)
                return false;
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][cols] == i)
                return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (cols / 3) * 3;

        for (int j = startRow; j < startRow + 3; j++) {
            for (int k = startCol; k < startCol + 3; k++) {
                if (board[j][k] == i)
                    return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {


        LC_037 obj = new LC_037();
        
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },

                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },

                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

      obj.solveSudoku(board);

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

}