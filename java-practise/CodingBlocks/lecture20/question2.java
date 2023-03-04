package lecture20;

public class question2 {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        queenCom(board, tq, "", 0, 0);
    }

    public static void queenCom(boolean[] board, int tq, String ans, int qpsf, int index) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = index; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                queenCom(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i + 1);
            }
            board[i] = false;
            // this is backtracking
            // whenever recursion do not undo, we do it forcefully

        }


    }
}
