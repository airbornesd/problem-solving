package patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int kHelp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int k = 1; k <= kHelp; k++) {
                System.out.print("\t");
            }
            if (i == n) {
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            } else {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
            kHelp -= 2;
        }
    }
}