package lecture18;

public class question3dot1 {
    public static void main(String[] args) {
        int des = 4;
        int curr = 0;
        System.out.println(printPath(0, des, ""));
    }

    public static int printPath(int curr, int des, String ans) {
        if (curr == des) {
            return 1;
        }
        if (curr > des) {
            return 0;
        }


        int a = printPath(curr + 1, des, ans + 1);
        int b = printPath(curr + 2, des, ans + 2);
        int c = printPath(curr + 3, des, ans + 3);
        return a + b + c;

    }
}
