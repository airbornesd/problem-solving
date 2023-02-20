package patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;

        for (int i = 1; i <= n; i++) {
            for (int j = m - 1; j > 0; j--) {
                System.out.print(" \t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            m--;
        }
    }
}
