package patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int forSpace = 0;
        int forStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n / 2; j > forSpace; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= forStars; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i >= (n + 1) / 2) {
                forSpace--;
                forStars -= 2;
            } else {
                forSpace++;
                forStars += 2;
            }
        }
    }
}
