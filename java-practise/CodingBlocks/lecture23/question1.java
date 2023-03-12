package lecture23;

public class question1 {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        print(board, n, 0);
        display(board);
    }

    public static void print(boolean[][] board, int tq, int row) {
        if (tq == 0) {
            display(board);
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                print(board, tq - 1, row + 1);
                board[row][col] = false;
            }
        }

    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        int r = row;
        // up
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // right diagonal
        r = row;
        int c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            c++;
            r--;
        }
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            c--;
            r--;
        }

        return true;
    }

    public static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("***************");
    }
}
