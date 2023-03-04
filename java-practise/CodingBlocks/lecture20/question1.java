package lecture20;

public class question1 {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        queenPer(board, tq, "", 0);
    }

    public static void queenPer(boolean[] board, int tq, String ans, int qpsf) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                queenPer(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1);
            }
            board[i] = false;
            // this is backtracking
            // whenever recursion do not undo, we do it forcefully

        }


    }
}
