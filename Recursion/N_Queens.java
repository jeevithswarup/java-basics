import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i],'.');
        }
        backtrack(0, board, result);

        return result;
    }

    public void backtrack(int col, char[][] board, List<List<String>> result) {

        if (col == board.length) {
            result.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (checkQueen(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(col + 1, board, result);
                board[row][col] = '.';
            }
        }

    }

    public boolean checkQueen(char[][] board, int row, int col) {
        int i = row;
        int j = col;
        while (j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
         i = row;
        j = col;
        while (i < board.length && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
     private List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }

    public static void main(String[] args) {
        N_Queens obj = new N_Queens();
        int n = 4;
        
        System.out.println(obj.solveNQueens(n));

    }
}
