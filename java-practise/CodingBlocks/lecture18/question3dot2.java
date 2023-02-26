package lecture18;

import java.util.Scanner;

public class question3dot2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int des = scn.nextInt();
        int curr = 0;
        System.out.println("count is: " + printPath(0, des, ""));
    }

    public static int printPath(int curr, int des, String ans) {
        if (curr == des) {
            System.out.println(ans + " ");
            return 1;
        }
        if (curr > des) {
            return 0;
        }

        int a = 0;
        for (int dice = 1; dice < des; dice++) {
            int b = printPath(curr + dice, des, ans + dice);
            a = a + b;
        }
        return a;
    }
}
