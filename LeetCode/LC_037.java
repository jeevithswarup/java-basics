public class LC_037 {
    

    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int cols = 0; cols < 9; cols++) {
                char ch = board[row][cols];
                if (ch == '.') {

                    for (char i = '1'; i < '9'; i++) {

                        if (isValid(board, row, cols, i)) {

                        }
                    }

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
        
        

        return true;
        
    }
}
