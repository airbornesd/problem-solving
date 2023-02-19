package lecture16;

// find out pow using tail recursion

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(fact(a, b));
    }

    public static int fact(int n, int ans) {
        if (ans == 0) return 1;

        return fact(n, ans - 1) * n;

    }
}