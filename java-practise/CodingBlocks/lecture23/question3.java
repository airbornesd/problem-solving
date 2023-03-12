package lecture23;

public class question3 {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "AE";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = wordSearch(board, word, i, j, 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }

    private static boolean wordSearch(char[][] board, String word, int row, int col, int k) {
        if (k == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(k)) {
            return false;
        }

        board[row][col] = '*';
        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};
        for (int i = 0; i < c.length; i++) {
            boolean ans = wordSearch(board, word, row + r[i], col + c[i], k + 1);
            if (ans == true) {
                return ans;
            }
        }
        board[row][col] = word.charAt(k);

        return false;
    }

}