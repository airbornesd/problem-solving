package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int forSpace = 0;
        int forStars = 1;
        int rows = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n / 2; j > forSpace; j--) {
                System.out.print("\t");
            }

            int rowsNew = rows;
            for (int k = 1; k <= forStars; k++) {
                System.out.print(rowsNew + "\t");
                if (k > forStars / 2) {
                    rowsNew--;
                } else {
                    rowsNew++;
                }
            }
            System.out.println();
            if (i >= (n + 1) / 2) {
                forSpace--;
                forStars -= 2;
            } else {
                forSpace++;
                forStars += 2;
            }

            // for getting digit instead of stars
            if (i > n / 2) {
                rows--;
            } else {
                rows++;
            }
        }


    }
}
