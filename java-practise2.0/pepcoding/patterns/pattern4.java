package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("\t");
            }
            for (int k = m; k >= 1; k--) {
                System.out.print("*\t");
            }
            System.out.println();
            m--;
        }
    }
}
