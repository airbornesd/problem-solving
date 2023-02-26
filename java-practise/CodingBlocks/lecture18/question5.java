package lecture18;

public class question5 {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        // matrix 3X4
        printPath(0, 0, n - 1, m - 1, "");

    }

    public static void printPath(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
            System.out.println(ans + " ");
            return;
        }
        if (cc > ec || cr > er) {
            return;
        }

        printPath(cr, cc + 1, er, ec, ans + "H");
        printPath(cr + 1, cc, er, ec, ans + "V");

    }
}
