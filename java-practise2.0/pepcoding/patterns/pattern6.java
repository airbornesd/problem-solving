package patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = (n / 2) + 1;

        int spaceVal = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*\t");
            }
            for (int k = 0; k < spaceVal; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < m; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i > n / 2) {
                spaceVal -= 2;
                m++;
            } else {
                spaceVal += 2;
                m--;
            }
        }
    }
}
