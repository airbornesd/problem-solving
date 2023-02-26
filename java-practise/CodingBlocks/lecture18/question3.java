package lecture18;

public class question3 {
    public static void main(String[] args) {
        int des = 4;
        int curr = 0;
        printPath(0, des, "");
    }

    public static void printPath(int curr, int des, String ans) {
        if (curr == des) {
            System.out.println(ans + " ");
            return;
        }
        if (curr > des) {
            return;
        }


        printPath(curr + 1, des, ans + 1);
        printPath(curr + 2, des, ans + 2);
        printPath(curr + 3, des, ans + 3);

    }
}
