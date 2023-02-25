package hackAssignment;

import java.util.Scanner;

public class hollowRhombusPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {

                if (i + j == 2 * n || i + j == n + 1) {
                    System.out.print("*");
                } else if (i == 1 && i + j > n + 1) {
                    System.out.print("*");
                } else if (i == n && i + j <= (2 * n) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
